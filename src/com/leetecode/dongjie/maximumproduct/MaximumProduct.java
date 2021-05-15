package com.leetecode.dongjie.maximumproduct;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = new int[]{-4, -3, -2, -1, 60};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int product, max = 0;
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        //遍历数组
        for (int i = 0; i < nums.length - 2; ++i)
            for (int j = i + 1; j < nums.length - 1; ++j)
                for (int k = j + 1; k < nums.length; ++k) {
                    product = nums[i] * nums[j] * nums[k];
                    max = Math.max(product, max);
                }


        return max;
    }
}
