package com.leetecode.top100.array.numoftimes;

//数字在排序数组中出现的次数
//例如输入排序数组{1， 2， 3， 3， 3， 3， 4， 5}例如数字3出现4次
public class NumOfTimes {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 3, 3, 4, 4, 5};
        int index = twoSearch(arr, 0, arr.length - 1, 8);
        int count = 0;
        if (index != -1) {
            count++;
            for (int i = 0; i < index; ++i) {
                if (arr[i] == arr[index]) {
                    count++;
                }
            }
            for (int i = index + 1; i < arr.length; ++i) {
                if (arr[i] == arr[index]) {
                    count++;
                }
            }
        } else {
            count = -1;
        }
        System.out.println(count);

    }

    public static int twoSearch(int[] arr, int left, int right, int target) { //二分查找
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (target > arr[mid]) { //目标元素大于中间元素
            return twoSearch(arr, mid + 1, right, target);
        } else if (target < arr[mid]) {
            return twoSearch(arr, left, mid - 1, target);
        } else {
            return mid;
        }

    }
}
