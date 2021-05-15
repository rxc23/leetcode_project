package com.thread.createthread4;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; ++i) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread2());
        thread.start();
    }
}
