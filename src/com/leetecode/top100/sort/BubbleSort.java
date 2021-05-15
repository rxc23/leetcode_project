package com.leetecode.top100.sort;

//冒泡排序
//最好1,2,3,4,5,6       O(N)
//最坏：6,5,4,3,2,1     O(N2)
//平均:O(N2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 4, 3, 2, 1};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int out : arr) {
            System.out.print(out + " ");
        }
    }
}
