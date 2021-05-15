package com.leetecode.examination.scanner;

//输入第一行仅包含三个正整数n,x,y，分别表示参赛的人数和晋级淘汰人数区间。(1<=n<=50000,1<=x,y<=n)
//输入第二行包含n个整数，中间用空格隔开，表示从1号选手到n号选手的成绩。(1<=|a_i|<=1000)

//输入例子1：
//   6  2  3
//   1  2  3  4  5  6

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Scanner1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("  ");
        int n = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        int y = Integer.parseInt(str[2]);
        String[] arr = br.readLine().trim().split("  ");
        int[] scores = new int[n];
        for (int i = 0; i < scores.length; ++i) {
            scores[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(scores); //排序
        for (int arr1 : scores) {
            System.out.println(arr1);
        }


    }
}
