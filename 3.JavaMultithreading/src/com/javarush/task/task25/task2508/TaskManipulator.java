package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    Thread t;
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    public void start(String threadName) {
        t = new Thread(this);
        t.setName(threadName);
        t.start();
    }

    @Override
    public void stop() {
        t.interrupt();
    }
}
