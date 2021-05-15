package com.leetecode.examination.meituan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 某比赛已经进入了淘汰赛阶段,已知共有n名选手参与了此阶段比赛，他们的得分分别是a_1,a_2….a_n,小美作为比赛的裁判希望设定一个分数线m，使得所有分数大于m的选手晋级，其他人淘汰。
 * 但是为了保护粉丝脆弱的心脏，小美希望晋级和淘汰的人数均在[x,y]之间。
 * 显然这个m有可能是不存在的，也有可能存在多个m，如果不存在，请你输出-1，如果存在多个，请你输出符合条件的最低的分数线。
 * <p>
 * <p>
 * 输入描述:
 * 输入第一行仅包含三个正整数n,x,y，分别表示参赛的人数和晋级淘汰人数区间。(1<=n<=50000,1<=x,y<=n)
 * 输入第二行包含n个整数，中间用空格隔开，表示从1号选手到n号选手的成绩。(1<=|a_i|<=1000)
 * <p>
 * 输出描述:
 * 输出仅包含一个整数，如果不存在这样的m，则输出-1，否则输出符合条件的最小的值。
 * <p>
 * 输入例子1:
 * <p>
 * 6 2 3
 * 1 2 3 4 5 6
 * <p>
 * <p>
 * 输出例子1:
 * <p>
 * 3
 */

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split(" ");
        int n = Integer.parseInt(str[0]);//参赛人数
        int x = Integer.parseInt(str[1]);//区间x
        int y = Integer.parseInt(str[2]);//区间y
        String[] arr = br.readLine().trim().split(" ");
        int[] scores = new int[n];
        for (int i = 0; i < scores.length; ++i) {
            scores[i] = Integer.parseInt(arr[i]);  //成绩
        }

        game(scores, x, y);
    }

    public static void game(int[] scores, int x, int y) {
        int minScore = 0, temp = 1001;  //设置初始分数
        int dyCount, xyCount;
        int i;
        for (int j = 0; j < scores.length; ++j) { //假走
            minScore = scores[j];
            dyCount = 0;
            xyCount = 0;
            for (i = 0; i < scores.length; ++i) { //真正的走
                if (scores[i] > minScore) {
                    dyCount++;
                } else {
                    xyCount++;
                }
            }
            if ((dyCount >= x && dyCount <= y) && (xyCount >= x && xyCount <= y)) {
                temp = Math.min(minScore, temp);
            }
        }
        System.out.println(temp);


    }
}
