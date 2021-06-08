package com.onjava8.demo1;

import org.junit.Test;

/**
 * @Author: dongjie
 * @Date: 2021/6/2 14:53
 */
public class LabelFor {
    @Test
    public void test1() {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        // 将 x 转换为字符串
        System.out.println(x + " " + s);
        s += "(summed) = ";
        // 级联操作
        //x, y, z (summed) = 3
        System.out.println(s + (x + y + z));
        //3x, y, z (summed) =
        System.out.println((x + y + z) + s);
        // Integer.toString() 方法的简写:
        System.out.println("" + x);
    }

    @Test
    public void test2() {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));
        long l = -1;
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));
        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));
        byte b = -1;
        System.out.println(Integer.toBinaryString(b));
        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));
        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b >>> 10));

    }

}
