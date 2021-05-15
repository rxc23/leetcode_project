package com.leetecode.top100.array.windows;


import java.util.ArrayList;
import java.util.List;

//给定一个数组和滑动窗口的大小，找出所有滑动窗口里的最大值
//如：数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，求该滑动窗口的最大值[4, 4, 6, 6, 6, 5]
public class MaxWindows {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 6, 2, 5, 1};
        System.out.println(maxWindows(arr, 3));
    }

    public static List<Integer> maxWindows(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        if (arr == null || arr.length == 0 || n == 0) {
            return null;
        } else if (arr.length == 2) {
            int max = Math.max(arr[0], arr[1]);
            list.add(max);
        } else if (arr.length == 1) {
            list.add(arr[0]);
            return list;
        } else {
            for (int i = 0; i < arr.length - 2; ++i) {
                int max = Math.max(Math.max(arr[i], arr[i + 1]), arr[i + 2]);
                list.add(max);
            }
        }

        return list;
    }
}
