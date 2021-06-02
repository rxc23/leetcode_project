package com.thread.createthread_1;


public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; ++i) {
            System.out.println(Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
