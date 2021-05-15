package com.leetecode.top100.other.scanner;

import java.util.Scanner;

//多行输入
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入多行：");
        String s = scanner.nextLine();
        while (s != null && !s.equals(" ")) {
            System.out.println(s);
            s = scanner.nextLine();
        }


    }
}
