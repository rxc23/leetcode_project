package com.leetecode.dongjie.findmediansortedarrays.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/*
 *2020-9-4    寻找两个正序数组的中位数
 * */
public class FindMedianSortedArraysDemo {
    public static void main(String[] args) {
        Integer[] nums1 = new Integer[]{4, 1, 2};
        Integer[] nums2 = new Integer[]{5, 3, 4};

        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println("中位数：" + medianSortedArrays);
    }

    public static double findMedianSortedArrays(Integer[] nums1, Integer[] nums2) {
        double middleNum = 0.0;
//        1.合并数组
//        将数组转化为集合
        ArrayList<Integer> list = new ArrayList(Arrays.asList(nums1));
        ArrayList<Integer> list2 = new ArrayList(Arrays.asList(nums2));
        list.removeAll(list2);
        list.addAll(list2);
        //2.对集合进行排序，从小到大
        Collections.sort(list);
        System.out.println("排序后：" + list);
        //3.判断集合个数是奇偶
        if (list.size() % 2 == 1) {
            //奇数
            middleNum = list.get((list.size() - 1) / 2);

        } else {
            //偶数
            int x = list.size() / 2;
            middleNum = (list.get(list.size() / 2) + list.get((x - 1)) + 0.0) / 2;
        }

        return middleNum;
    }
}
