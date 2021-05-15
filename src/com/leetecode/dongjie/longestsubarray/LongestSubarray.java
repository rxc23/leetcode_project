package com.leetecode.dongjie.longestsubarray;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/*
 *2020-9-28   绝对值不超过限制的最长连续子数组
 *
 * */
public class LongestSubarray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 6, 7, 8, 10, 6, 5, 6};
        System.out.println(longestSubarray(nums, 4));
    }


    public static int longestSubarray(int[] nums, int limit) {
//        创建一个队列
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(nums[0]);
        int max = nums[0], min = nums[0];
        //遍历队列，得到每一个队列
        for (int i = 1; i < nums.length; ++i) {
            if (Math.abs(max - nums[i]) <= limit && Math.abs(min - nums[i]) <= limit && Math.abs(max - min) <= limit) {
                queue.offer(nums[i]);
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[i]);

            } else {
                queue.offer(nums[i]);
                queue.poll();
                max = Collections.max(queue);
                min = Collections.min(queue);
            }
        }

        System.out.println(queue);
        return queue.size();
    }
}
