package com.leetecode.dongjie.getwinner;

import java.util.HashMap;
import java.util.Map;

/*
 * 2020-9-14     找出数组游戏的赢家
 *
 * 超出时间限制
 * */

public class GetWinner {
    public static void main(String[] args) {
        //创建一个静态数组
        int[] ints = new int[]{1, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println(getWinner(ints, 1000000000));
    }


    public static int getWinner(int[] arr, int k) {
        int temp = 0;
        //创建一个map集合
        Map<Integer, Integer> map = new HashMap<>();
//        for(int i=0;i<1000000000;++i){

        while (arr[0] != k || arr[1] != k) {
            if (arr[0] > arr[1]) {
                if (!map.containsKey(arr[0])) {
                    Integer value = 0;
                    ++value;
                    map.put(arr[0], value);
                } else {
                    Integer va = map.get(arr[0]);
                    va++;
                    map.put(arr[0], va);
                }
                //判断是否等于k
                if (k == map.get(arr[0])) return arr[0];
                //交换数组中元素的位置
                temp = arr[1];
                for (int j = 1; j < arr.length - 1; ++j) arr[j] = arr[j + 1];

            } else {
                if (!map.containsKey(arr[1])) {
                    Integer value = 0;
                    ++value;
                    map.put(arr[1], value);
                } else {
                    Integer va = map.get(arr[1]);
                    va++;
                    map.put(arr[1], va);
                }
                //判断是否等于k
                if (k == map.get(arr[1])) return arr[1];
                //交换数组中元素的位置
                temp = arr[0];
                for (int j = 0; j < arr.length - 1; ++j) arr[j] = arr[j + 1];
                arr[arr.length - 1] = temp;
            }
        }
//        }


        return 0;
    }
}
