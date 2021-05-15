package com.leetecode.dongjie.trap;

/*
 *2020-9-9   直方图的水量
 * */

public class Trap {
    public static void main(String[] args) {
        //动态初始化一个数组
        int height[] = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }


    public static int trap(int[] height) {
        if (height == null || height.length <= 2) return 0;

        int top = 0, higntestIndex = 0, total = 0;    //最高的板子,最高板子的下标，总蓄水量

        //找到最高的板子
        for (int i = 0; i < height.length; ++i) {
            if (height[i] > top) {
                top = height[i];
                higntestIndex = i;
            }
        }

        //从左边找到相对较高的板子，进行蓄水
        for (int i = 0, j = 0; i < higntestIndex; ++i) {
            if (height[i] >= height[j]) {
                j = i;
            } else {
                total = height[j] - height[i] + total;
            }
        }
        //从右边找到相对较高的板子，进行蓄水
        for (int i = height.length - 1, j = height.length - 1; i > higntestIndex; --i) {
            if (height[i] >= height[j]) {
                j = i;
            } else {
                total = height[j] - height[i] + total;
            }
        }

        return total;
    }
}
