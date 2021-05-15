package com.leetecode.top100.array.duplicatenums;

import java.util.ArrayList;
import java.util.HashSet;

//输出数组中重复的数字
public class DuplicateNums {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 0, 2, 5, 3};
        duplicateNums(arr);
    }

    public static void duplicateNums(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        while (left < arr.length) {
            while (left < arr.length && set.contains(arr[left])) {  //先判断left<arr.length,否则数组会越界
                list.add(arr[left]);
                left++;
            }
            if (left < arr.length) {
                set.add(arr[left]);
                left++;
            }

        }
        for (Integer a : list) {
            System.out.println(a);
        }

    }
}
