package com.leetecode.dongjie.summaryranges;

import java.util.ArrayList;
import java.util.List;

/*
 * 2020-9-28  汇总区间
 * */

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 3, 4, 6, 8, 9};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> summary = new ArrayList<>();
        for (int i = 0, j = 0; i < nums.length; ++i) {
            if (i + 1 < nums.length && nums[i + 1] - nums[i] == 1) continue;
            if (i == j) summary.add(nums[i] + "");
            else summary.add(nums[j] + "->" + nums[i]);
            j = i + 1;
        }
        return summary;


    }
}
