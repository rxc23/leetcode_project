package com.leetecode.top100.array.uglynumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//输出第n个丑数，丑数是=min(当前丑数*2，*3，*5)
//习惯数上把1当做第1个丑
public class UglyNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(uglyNumber(n));

    }

    public static int uglyNumber(int n) {
        if (n == 0) {  //没有丑数
            return -1;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        int multi2 = 0, multi3 = 0, multi5 = 0;
        int i = 1;
        while (i < n) {
            int min = Math.min(Math.min(arr[multi2] * 2, arr[multi3] * 3), arr[multi5] * 5);
            arr[i] = min; //把丑数存起来，用空间换时间
            if (arr[multi2] <= min) multi2++;
            if (arr[multi3] <= min) multi3++;
            if (arr[multi5] <= min) multi5++;
            i++;
        }

        return arr[n - 1];
    }
}
