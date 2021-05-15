package com.leetecode.top100.sort;

//快速排序
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 1, 2, 8, 9, 0};
        quickSort(arr, 0, arr.length - 1);

    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int bame = arr[left];
        int i = left;
        int j = right;

        while (i != j) {//左边第一个元素作为基准元素，从右边开始走
            while (arr[j] >= bame && i < j) {
                j--;
            }

            while (arr[i] <= bame && i < j) {
                i++;
            }

            //找到   arr[j]<bame  需要交换位置
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        //当i和j相遇，第一次快排结束,将bame和ij相遇的元素位置交换
        arr[left] = arr[i];
        arr[i] = bame;

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        //这里所有左边元素<bame;右边元素>bame
        //使用递归进行bame左右两边进行排序
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }
}
