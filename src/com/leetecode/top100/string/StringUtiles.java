package com.leetecode.top100.string;

//字符串工具类
public class StringUtiles {
    public static void main(String[] args) {
        String str = "123";
        //字符串>>>int
        System.out.println(Integer.parseInt(str));
        System.out.println(Integer.valueOf(str).intValue());

        int i = 123;
        //int>>>string
        System.out.println(String.valueOf(i));
        System.out.println(Integer.toString(i));

        String[] s = {"1", "2", "3"};
        int[] arr = new int[s.length];
        //string[]  >>>int[]
        for (int j = 0; j < s.length; ++j) {
            arr[j] = Integer.parseInt(s[j]);
        }
        for (int a : arr) {
            System.out.print(a);
        }
    }
}
