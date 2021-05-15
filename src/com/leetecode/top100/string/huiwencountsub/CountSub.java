package com.leetecode.top100.string.huiwencountsub;

//计算字符串中回文子串的个数
public class CountSub {
    public static void main(String[] args) {
        String s = "aba";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;

        for (int i = 0; i < s.length(); ++i) {
            for (int j = 0; j <= i; ++j) {
                if (s.charAt(i) == s.charAt(j) && (i - j < 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
