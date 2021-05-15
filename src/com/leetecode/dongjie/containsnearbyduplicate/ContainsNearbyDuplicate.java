package com.leetecode.dongjie.containsnearbyduplicate;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{99, 99};
        System.out.println(containsNearbyDuplicate(nums, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; ++i)
            for (int j = i + 1; j < nums.length; ++j)
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) return flag;


        return false;
    }
}
