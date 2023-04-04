package com.arithmetic.code.thread;

/**
 * thread basic
 * extends Thread base on template
 */
public class ThreadBasic {
    public static void main(String[] args) {
        // basic thread
        new ThreadBasic.Test1().start();
    }

    static class Test1 extends Thread {
        @Override
        public void run() {
            System.out.println("static class inner extends thread");
        }
    }
}
