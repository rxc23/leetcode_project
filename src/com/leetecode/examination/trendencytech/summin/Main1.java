package com.leetecode.examination.trendencytech.summin;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入一个字符串n
 * 输入截取的位数
 * 输出最小的字符串
 * <p>
 * 测试案例
 * 输入：1432319
 * 输入：3
 * 输出：1219
 * <p>
 * 测试案例:
 * 输入：2020
 * 输入：1
 * 输出：20
 */

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();//输入数字N
        int x = Integer.parseInt(br.readLine());//截取x位

        subMin(n, x);
    }

    public static int subMin(String n, int x) {
        if (n == null || n.length() == 0 || n.length() == x) {
            return 0;
        }
        int min = 0;
        for (int i = 0; i < n.length() - 2; ++i) {
            for (int j = i + 1; j < n.length() - 1; ++j) {
                for (int k = j + 1; k < n.length(); ++k) {
                    //1.对字符串进行截取，得到sub,将sub转成int类型
//                    int result = Integer.parseInt(sub);
//                    min = Math.min(result, min);
                }
            }
        }

        return min;
    }
}
