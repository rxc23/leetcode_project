package com.leetecode.top100.other.iterator100;


//跌倒求解1~100的和
public class IteratorNum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
    }
}
