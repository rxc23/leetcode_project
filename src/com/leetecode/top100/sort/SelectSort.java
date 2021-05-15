package com.leetecode.top100.sort;


/*
选择排序：从待排序的序列中选择最小的元素与序列的第一个元素交换；再从待排序的元素中选择次小的元素与第一个元素交换，按照此步骤继续下去；
最好：O(N2)；   平均：O(N2);   最坏O(N2)
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int tempArr = 0;
        for (int i = 0; i < arr.length - 1; ++i) {
            int temp = i;
            for (int j = i; j < arr.length - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    temp = j + 1;
                }
            }

            if (temp != i) {
                tempArr = arr[i];
                arr[i] = arr[temp];
                arr[temp] = tempArr;
            }

        }

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
