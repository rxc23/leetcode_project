package com.leetecode.dongjie.shortestpalindrome;

/*
 * 2020/8/30-----最短回文串
 * */
public class ShortestPalindRome {

    public static void main(String[] args) {
        String string = zuiDuanHuiWen("aacecaaa");
        System.out.println(string);
    }


    public static String zuiDuanHuiWen(String string) {
        //字符串反转
        String reverse = new StringBuffer(string).reverse().toString();
        int length_s = string.length();
        int i = 0;
        for (; i < length_s; ++i) {
            if (string.substring(0, length_s - i).equals(reverse.substring(i, length_s))) {
                break;
            }
        }
        return new StringBuffer(string.substring(length_s - i, length_s)).reverse() + string;
    }
}
