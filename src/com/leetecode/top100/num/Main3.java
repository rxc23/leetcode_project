package com.leetecode.top100.num;

/**
 * 题目：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 *
 * @Author: dongjie
 * @Date: 2021/6/7 20:06
 */
public class Main3 {
    /**
     * 思路：把一个整数减去1再和原整数与，就会把整数最右边的一个1变成0
     *
     * @param args
     */
    public static void main(String[] args) {
        int count = 0, n = 9;

        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        System.out.println(count);
    }


}
