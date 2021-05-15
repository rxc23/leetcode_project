package com.thread.multiplethread;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread2 implements Runnable {
    //使用了原子类，实现了线程安全都是400
    public static AtomicInteger i = new AtomicInteger(0);

    @Override
    public void run() {
        for (int j = 0; j < 100; ++j) {
            i.getAndIncrement();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread2());
        Thread t2 = new Thread(new MyThread2());
        Thread t3 = new Thread(new MyThread2());
        Thread t4 = new Thread(new MyThread2());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Thread.sleep(1000);  //休眠下，让线程执行完
        System.out.println(MyThread2.i);
    }
}
