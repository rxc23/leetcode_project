package com.thread.createthread_2;

import org.junit.Test;

import java.util.concurrent.FutureTask;

/**
 * @Author: dongjie
 * @Date: 2021/5/27 11:33
 */
public class Mug {
    @Test
    public void test1() {
        new Thread(() -> {
            System.out.println(Thread.currentThread());
            System.out.println("runnable方式创建线程");
        }).start();
    }

    @Test
    public void test2() {
        new Thread(new FutureTask<Integer>(() -> {
            System.out.println(Thread.currentThread());
            System.out.println("这是callable方式创建线程");
            return 0;
        })).start();
    }
}
