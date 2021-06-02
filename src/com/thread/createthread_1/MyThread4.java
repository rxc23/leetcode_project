package com.thread.createthread_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; ++i) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        MyThread4 myThread4 = new MyThread4();
        es.execute(myThread4);

    }
}
