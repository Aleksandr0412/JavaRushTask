package com.javarush.task.task25.task2512;

/* 
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    public static void main(String[] args) {
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        if (e.getCause() != null) {
            uncaughtException(t, e.getCause());
        }
        System.out.println(e.getClass().getName() + ": " + e.getMessage());


    }
}
