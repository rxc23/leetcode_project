package com.leetecode.top100.search;

//二分查找
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 7, 9, 10, 13, 15, 18};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 100));
    }

    //二分查找前提是已经排好序的元素，否则无效
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) { //条件不成立
            return -1;
        }
        int mid = (left + right) / 2;

        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {  //目标元素<中间元素，元素减半，中间元素-1
            return binarySearch(arr, left, mid - 1, target);  //左边元素使用递归
        } else if (target > arr[mid]) {   //目标元素>中间元素，元素减半，中间元素+1
            return binarySearch(arr, mid + 1, right, target);    //右边元素使用递归实现
        }
        return -1;
    }

}
