package com.leetecode.dongjie.addtwonumbers;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest mt = new ThreadTest();

        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        t1.start();
        t2.start();
        // 休眠一下，让线程执行完毕。
        Thread.sleep(500);
        System.out.println(ThreadTest.i);
    }
}


class ThreadTest implements Runnable {

    static int i = 0;

    public void run() {
        for (int m = 0; m < 1000000; m++) {
            i++;
        }
    }
}