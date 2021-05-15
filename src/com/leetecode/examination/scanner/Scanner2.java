package com.leetecode.examination.scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//第一行输入一个整数T(1<=T<=10),表示数据数组
//每组数据占四行，第一行输入一个整数N(1<=N<=500000)
//第二行输入一个长度为N且包含数字0、1、2的字符串
//第三行输入一个整数M
//第四行输入一个长度为M且仅包含字母M、F的字符串
public class Scanner2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //整数T
        for (int i = 0; i < T; ++i) { //T组数据
            int N = Integer.parseInt(br.readLine());  //整数N
            String str = br.readLine();   //长度N,且0,1,2的字符串
            int M = Integer.parseInt(br.readLine());  //整数M
            String arrstr = br.readLine();  //长度M,且包含MF的字符串
        }
    }
}
