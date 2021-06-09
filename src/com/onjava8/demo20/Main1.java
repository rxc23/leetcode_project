package com.onjava8.demo20;

import org.junit.Test;

/**
 * @Author: dongjie
 * @Date: 2021/6/9 0:41
 */
public class Main1 {
    @Test
    public void test1() {
        int i = -16;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i >> 3));
    }


    @Test
    public void test2() {
        int i = -10;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i >> 3));
    }

    @Test
    public void test3() {
        int i = 16;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i >>> 3));
    }


    @Test
    public void test4() {
        int i = -16;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i >>> 3));
    }

    @Test
    public void test5() {
        int i = -10;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i >>> 3));
    }
}
