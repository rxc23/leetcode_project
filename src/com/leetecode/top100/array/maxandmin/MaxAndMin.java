package com.leetecode.top100.array.maxandmin;

//求数组中最大的元素和最小的元素
public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 6, 2, 3, 4};

        maxAndMin(arr);
    }

    private static void maxAndMin(int arr[]) {
        int tempMax = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > tempMax) { //寻找最大的元素
                tempMax = arr[i];
            }
        }
        System.out.println("最大元素：" + tempMax);

        int tempMin = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < tempMin) {
                tempMin = arr[i];
            }
        }
        System.out.println("最小元素：" + tempMin);

    }
}
