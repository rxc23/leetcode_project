package com.leetecode.dongjie.longestpalindrome;


/*
 * 2020-9-5    最长回文子串
 * */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        int len = 0;
        String temp = "", test = "";
        //暴力解法：得到每一个字符子串
        for (int i = 0; i < s.length(); ++i)
            for (int j = i; j < s.length(); ++j) {
                String substring = s.substring(i, j + 1);
                temp = new StringBuffer(substring).reverse().toString();
//                System.out.println(substring+"--------"+temp);
                if (substring.equals(temp) && j - i + 1 > len) {
                    test = s.substring(i, j + 1);
                    len = Math.max(len, j - i + 1);
//                    System.out.println(len);
                }
            }
        return test;
    }

}
