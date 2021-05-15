package com.jct.demo8;

import org.junit.Test;

/**
 * lambda表达式
 *
 * @Author: dongjie
 * @Date: 2021/5/15 10:15
 */
public class Main2 {
    @Test
    public void test() {
        //old
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类实现线程");
            }
        }).start();

        //lambda表达式
        new Thread(() -> System.out.println("匿名内部类实现线程")).start();


    }
}
