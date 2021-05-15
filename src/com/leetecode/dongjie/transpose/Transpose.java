package com.leetecode.dongjie.transpose;

/*
 * 2020-9-6   装置矩阵
 * */
public class Transpose {
    public static void main(String[] args) {
        int[][] A = new int[][]{{1, 2, 3}, {4, 5, 6}};

        int[][] transpose = transpose(A);

        /*
         * 遍历转换后的矩阵
         * */
        for (int i = 0; i < transpose.length; ++i) {
            for (int j = 0; j < transpose[0].length; ++j) {
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }
    }


    /*
     * 将矩阵置换
     * */
    public static int[][] transpose(int[][] A) {
        int r = A.length;       //矩阵A的行数
        int c = A[0].length;    //矩阵A的列数
        //创建一个新的矩阵
        int[][] a = new int[c][r];
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                a[j][i] = A[i][j];
            }
        }
        return a;
    }
}
