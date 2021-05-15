package com.thread.Demo1;


class MyThead extends Thread {
    public void run() {
        System.out.println("Thread");
    }

    public static void main(String[] args) {
        MyThead t = new MyThead();
        MyThead s = new MyThead();
        t.start();
        System.out.println("one.");
        s.start();
        System.out.println("two.");
    }


}
