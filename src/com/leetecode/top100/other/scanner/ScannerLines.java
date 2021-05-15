package com.leetecode.top100.other.scanner;

import java.util.Scanner;

//输入数组
public class ScannerLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.nextLine();
        String[] s = str.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; ++i) {
            arr[i] = Integer.parseInt(s[i]);  //将string转成int
            System.out.println(arr[i]);
        }


    }
}
