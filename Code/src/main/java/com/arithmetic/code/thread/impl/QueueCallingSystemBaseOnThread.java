package com.arithmetic.code.thread.impl;

public class QueueCallingSystemBaseOnThread extends Thread {
    QueueCallingSystemBaseOnThread(String name) {
        super(name);
    }

    public static void main(String[] args) {
        new QueueCallingSystemBaseOnThread("QueueCallingSystem-1").start();
        new QueueCallingSystemBaseOnThread("QueueCallingSystem-2").start();
        new QueueCallingSystemBaseOnThread("QueueCallingSystem-3").start();

    }

    private final static int MAX = 50;
    // visibility
    private volatile static int index = 0;

    @Override
    public void run() {
        // lock
        synchronized (QueueCallingSystemBaseOnThread.class) {
            for (; index < MAX; index++) {
                System.out.println(Thread.currentThread().getName() + "----------------------" + index);
            }
        }

    }
}
