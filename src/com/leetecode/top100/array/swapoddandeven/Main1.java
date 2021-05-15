package com.leetecode.top100.array.swapoddandeven;

//交换数组顺序使奇数位于偶数前面
//方法一：遍历数组得到偶数将其拿出来，后面的元素向前挪动一位，最后空一个元素放入偶数    时间复杂度 o(n2)
public class Main1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        swapEvenAndOdds(arr);
    }

    private static int[] swapEvenAndOdds(int[] arr) {
        if (arr == null) return null;
        int temp = 0, j;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) {
                temp = arr[i];
                j = i;
                while (j < arr.length && j + 1 < arr.length) {
                    arr[j] = arr[j + 1];
                    j++;
                }
                arr[arr.length - 1] = temp;
            }

        }

        for (int out : arr) {
            System.out.print(out + " ");
        }

        return arr;

    }
}
