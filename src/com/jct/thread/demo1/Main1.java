package com.jct.thread.demo1;

import org.junit.Test;

/**
 * @Author: dongjie
 * @Date: 2021/5/15 17:17
 */
public class Main1 {
    public static final int DELAY = 10;
    public static final int STEPS = 100;
    public static final int MAX_AMOUNT = 1000;

    @Test
    public void test() {
        new Thread(() -> {
            try {
                for (int i = 0; i < STEPS; ++i) {
                    double amout = MAX_AMOUNT * Math.random();
                    System.out.println("hello");
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i < STEPS; ++i) {
                    double amout = MAX_AMOUNT * Math.random();
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
