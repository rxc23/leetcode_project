package com.thread.createthread_1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyThread3 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 100; ++i) {
            System.out.println(Thread.currentThread().getName());
        }
        return null;
    }

    public static void main(String[] args) {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread3());
        Thread thread = new Thread(futureTask);
        thread.start();
    }
}
