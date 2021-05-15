package com.leetecode.dongjie.majorityelement;

import java.util.HashMap;
import java.util.Map;
/*
 * 2020-9-13   主要元素
 * */

public class MajorityElement {
    public static void main(String[] args) {
        int[] ints = new int[]{3, 2, 3};

        System.out.println(majorityElement(ints));
    }


    public static int majorityElement(int[] nums) {
        int max = 0;
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        //如果长度为0，返回-1
        if (nums.length == 0) {
            return -1;
        }

        //遍历数组，装入map集合中，使用数组元素作为key，元素次数作为value
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                Integer value = map.get(i);
                value++;
                map.put(i, value);
            }
        }
        System.out.println(map);

        //得到次数超过一半的元素
        for (int j : map.keySet()) {
            if (map.get(j) > len / 2) {
                return j;
            }
        }

        return -1;
    }
}
