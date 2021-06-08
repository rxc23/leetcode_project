package com.leetecode.top100.num;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 数值的整数次方
 *
 * @Author: dongjie
 * @Date: 2021/6/3 0:53
 */
public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请任意输入一个数：");
        int base = Integer.parseInt(br.readLine());
        System.out.println("请任意输入一个整数：");
        int exponent = Integer.parseInt(br.readLine());
        powerMath(base, exponent);

    }

    /**
     * 求base的exponent次方
     *
     * @param base
     * @param exponent
     */
    private static void powerMath(int base, int exponent) {
        double result = 1.0;
        if (exponent == 0) {
            System.out.println(1);
        } else if (exponent > 0) {
            for (int i = 1; i <= exponent; ++i) {
                result = base * result;
            }
            System.out.println(result);
        } else {
            int num = -exponent;
            for (int i = 1; i <= num; ++i) {
                result = base * result;
            }
            System.out.println(1 / result);
        }

    }
}
