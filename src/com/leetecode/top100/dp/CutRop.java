package com.leetecode.top100.dp;

import java.util.Scanner;


/*剪绳子
思路：长度为3的段数越多，乘积越大，length%3==mo
mo==1
mo==2
mo==0
 */
public class CutRop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println(cutRop(length));
    }

    private static int cutRop(int length) {
        if (length == 0) {
            return 0;
        } else if (length == 1) {
            return 1;
        } else if (length == 2) {
            return 1;
        }

        int num = length / 3;
        int mo = length % 3;
        if (mo == 1) {
            return (int) Math.pow(3, num - 1) * 2 * 2;
        } else if (mo == 2) {
            return (int) Math.pow(3, num) * 2;
        } else { //mo==0
            return (int) Math.pow(3, num);
        }
    }

}
