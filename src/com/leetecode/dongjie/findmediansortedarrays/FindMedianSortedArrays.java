package com.leetecode.dongjie.findmediansortedarrays;


import java.util.ArrayList;

/*
 * 2020-9-4    寻找两个正序数组的中位数
 * */
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        Integer[] nums1 = new Integer[]{7, 1, 2, 0};
        Integer[] nums2 = new Integer[]{5, 3, 4};

        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);


    }

    public static double findMedianSortedArrays(Integer[] nums1, Integer[] nums2) {
        double middleNum = 0.0;
//        1.数据合并
        ArrayList<Integer> list = new ArrayList<>();
        if (nums1.length != 0)
            for (int ele : nums1) {
                list.add(ele);
            }
        if (nums2.length != 0)
            for (int ele : nums2) {
                list.add(ele);
            }
//      2.排序（冒泡排序）
        bubleSort(list);
        System.out.println(list);
        //   3.判断集合个数是奇偶
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

    /*
     * 冒泡排序
     * */
    public static ArrayList<Integer> bubleSort(ArrayList<Integer> list) {
        int temp = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    temp = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

}
