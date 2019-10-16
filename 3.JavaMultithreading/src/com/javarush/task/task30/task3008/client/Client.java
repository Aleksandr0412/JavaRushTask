package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.Socket;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    protected String getServerAddress() {
        return ConsoleHelper.readString();
    }

    protected int getServerPort() {
        return ConsoleHelper.readInt();
    }

    protected String getUserName() {
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            clientConnected = false;
            System.out.println("Сообщение не отправлено");
        }
    }

    public void run() {
        Thread t = getSocketThread();
        t.setDaemon(true);
        t.start();
        synchronized (this) {
            try {
                wait();
                if (clientConnected) {
                    System.out.println("Соединение установлено.\n" +
                            "Для выхода наберите команду 'exit'.");
                } else System.out.println("Произошла ошибка во время работы клиента.");
                while (clientConnected) {
                    String s;
                    if (!(s = ConsoleHelper.readString()).equals("exit")) {
                        if (shouldSendTextFromConsole()) sendTextMessage(s);
                    } else break;
                }
            } catch (InterruptedException e) {
                System.out.println("Ошибка");

            }
        }

    }

    public class SocketThread extends Thread {
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage(userName + " присоединился к чату");
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage(userName + " покинул чат");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            while (true) {
                Message m;
                m = connection.receive();
                if (m.getType() == MessageType.NAME_REQUEST) {
                    connection.send(new Message(MessageType.USER_NAME, getUserName()));
                } else if (m.getType() == MessageType.NAME_ACCEPTED) {
                    notifyConnectionStatusChanged(true);
                    break;
                } else throw new IOException("Unexpected MessageType");

            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            while (true) {
                Message m;
                m = connection.receive();
                if (m.getType() == MessageType.TEXT) {
                    processIncomingMessage(m.getData());
                } else if (m.getType() == MessageType.USER_ADDED) {
                    informAboutAddingNewUser(m.getData());
                } else if (m.getType() == MessageType.USER_REMOVED) {
                    informAboutDeletingNewUser(m.getData());
                } else throw new IOException("Unexpected MessageType");
            }
        }

        public void run() {
            try {

                Socket socket = new Socket(getServerAddress(), getServerPort());
                connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();

            } catch (IOException | ClassNotFoundException e) {
                notifyConnectionStatusChanged(false);
            }

        }
    }
}
