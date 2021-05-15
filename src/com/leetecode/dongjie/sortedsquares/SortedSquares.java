package com.leetecode.dongjie.sortedsquares;

/*
 * 2020-9-20  有序数组的平方
 * */
public class SortedSquares {
    public static void main(String[] args) {
        int[] A = new int[]{-4, -1, 0, 3, 10};
        System.out.println(sortedSquares(A));
    }

    public static int[] sortedSquares(int[] A) {
        int temp = 0;//定义一个临时变量
        //新建一个数组
        int[] B = new int[A.length];
        //得到每一个数组
        for (int i = 0; i < A.length; ++i) {
            double pow = (int) Math.pow(A[i], 2);
            B[i] = (int) pow;
        }

//        Arrays.sort(B);     //排序
        for (int i = 0; i < B.length - 1; ++i) {
            for (int j = 0; j < B.length - 1 - i; ++j) {
                if (B[j] > B[j + 1]) {
                    temp = B[j + 1];
                    B[j + 1] = B[j];
                    B[j] = temp;
                }
            }
        }
        return B;
    }
}
