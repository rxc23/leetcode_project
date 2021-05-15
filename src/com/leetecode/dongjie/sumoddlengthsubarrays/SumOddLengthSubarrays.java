package com.leetecode.dongjie.sumoddlengthsubarrays;

/*
 * 2020-9-21  所有奇数长度子数组的和
 * */
public class SumOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length; i += 2)
            for (int j = i; j <= arr.length; ++j)
                for (int k = j - i; k < j; ++k)
                    sum += arr[k];
        return sum;
    }
}
