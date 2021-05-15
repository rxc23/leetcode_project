package com.thread.multiplethread;

//该输出每次都是不确定的，比如：17，也就是不是线程安全的
public class MyThread implements Runnable {

    public static int i = 400;

    @Override
    public void run() {
        synchronized (this) {
            for (int j = 0; j < 100; ++j) {
                i--;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        Thread t4 = new Thread(myThread);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Thread.sleep(1000); //休眠一下让线程执行
        System.out.println(MyThread.i);
    }
}
