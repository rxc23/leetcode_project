package com.leetecode.dongjie.subrectanglequeries;


/*
 *2020-9-12   子矩阵查询
 * */

public class SubrectangleQueries {
    private int[][] array;

    public SubrectangleQueries(int[][] rectangle) {
        this.array = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; ++i)
            for (int j = col1; j <= col2; ++j) {
                array[i][j] = newValue;
            }

    }

    public int getValue(int row, int col) {

        return array[row][col];
    }


    public static void main(String[] args) {
        //初始化二维数组
        int[][] ints = new int[][]{{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}};
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(ints);
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        //得到矩阵
        for (int i = 0; i < ints.length; ++i) {
            for (int j = 0; j < ints[0].length; ++j) {
                System.out.print(ints[i][j]);
            }
            System.out.println();
        }
        System.out.println(subrectangleQueries.getValue(0, 2));


    }
}
