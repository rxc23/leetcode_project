package com.leetecode.dongjie.maximumproduct.method2;

import java.util.Arrays;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = new int[]{-4, -3, -2, -1, 60};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int max = 0;
        //对数组进行排序
        Arrays.sort(nums);
       /* 1.如果全是正数，则最大为最后三位相乘，
          2.如果有正有负，最大为最小的两个负数和最大的一个正数相乘
          3.全为负数，最大是最后三位相乘
        */
        max = Math.max((nums[0] * nums[1] * nums[nums.length - 1]), (nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]));
        return max;
    }
}
