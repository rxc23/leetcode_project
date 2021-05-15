package com.leetecode.top100.array.swap;

import java.util.Scanner;

//交换相邻元素
public class SwapJoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        swapJoins(arr);
    }

    public static void swapJoins(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int temp = 0, i = 0;
        if (arr.length % 2 == 0) { //偶数
            while (i < arr.length) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = i + 2;
            }
        } else { //奇数
            while (i < arr.length && i + 1 < arr.length) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = i + 2;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
