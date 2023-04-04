package com.arithmetic.code.thread;

/**
 * Runnable
 */
public class RunnableInterface {
    public static void main(String[] args) {
        // class implements Runnable
        new Thread(new RunnableInterface.Test1()).start();
        // anonymity class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymity Runnable");
            }
        }).start();
        // lambda
        new Thread(() -> {
            System.out.println("lambda Runnable");
        }).start();
    }

    static class Test1 implements Runnable {
        @Override
        public void run() {
            System.out.println("static class inner implements Runnable");
        }
    }
}
