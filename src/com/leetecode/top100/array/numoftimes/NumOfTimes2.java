package com.leetecode.top100.array.numoftimes;

//数字在排序数组中出现的次数
//例如输入排序数组{1， 2， 3， 3， 3， 3， 4， 5}例如数字3出现4次
public class NumOfTimes2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 6};
        int firstTarget = firstTarget(arr, 0, arr.length - 1, 100); //寻找最前一个target
        int lastTarget = lastTarget(arr, 0, arr.length - 1, 100);   //寻找最后一个target
        if (firstTarget == -1 || lastTarget == -1) {
            System.out.println(0);
        } else {
            System.out.println(lastTarget - firstTarget + 1);
        }
    }

    public static int firstTarget(int arr[], int left, int right, int target) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        }

        if (target > arr[mid]) {
            return firstTarget(arr, mid + 1, right, target);
        } else if (target < arr[mid]) {
            return firstTarget(arr, left, mid - 1, target);
        } else {
            if ((mid > 0 && arr[mid - 1] != target) || mid == 0) {
                return mid;
            } else {
                return firstTarget(arr, left, mid - 1, target);
            }
        }

    }

    public static int lastTarget(int arr[], int left, int right, int target) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        }

        if (target > arr[mid]) {
            return lastTarget(arr, mid + 1, right, target);
        } else if (target < arr[mid]) {
            return lastTarget(arr, left, mid - 1, target);
        } else {
            if ((mid < arr.length - 1 && arr[mid + 1] != target) || mid == arr.length - 1) {
                return mid;
            } else {
                return lastTarget(arr, mid + 1, right, target);
            }
        }

    }
}
