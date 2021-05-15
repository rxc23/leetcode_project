package com.leetecode.dongjie.twoSum;

/*
 *2020-8-30    两数之和
 *
 * */
public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int[] ints = twoSum(nums, 22);

    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i <= length - 2; ++i) {
            for (int j = i + 1; j <= length - 1; ++j) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("第一个数是：" + nums[i] + "第二个数是：" + nums[j]);
                    return new int[]{i, j};
                }

            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
