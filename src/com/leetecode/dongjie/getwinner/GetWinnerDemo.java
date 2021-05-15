package com.leetecode.dongjie.getwinner;

/*
 * 2020-9-14
 * 找出数组游戏赢家
 *
 * */
public class GetWinnerDemo {
    public static void main(String[] args) {
        //创建一个静态数组
        int[] ints = new int[]{1, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println(getWinner(ints, 1000000000));
    }


    public static int getWinner(int[] arr, int k) {
        int win = arr[0], count = 0;     //赢家和计数器
        /*
         * 1.i<arr.length不满足count<k满足的情况下：   在遍历完一轮后，还找不到满足条件的赢家，则赢家就是最大值
         * 2.i<arr.length满足，count<k不满足的情况下：找到满足条件的赢家，返回赢家即可
         * */
        for (int i = 1; i < arr.length && count < k; ++i) {
            if (arr[i] < win) count++;
            else {  //赢家发生改变，count重新计数为1
                win = arr[i];
                count = 1;
            }
        }


        return win;
    }
}
