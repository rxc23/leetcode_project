package com.leetecode.top100.array.twodimesionarrayfind;

//在二维数组中查找数字，存在返回true，不存在返回false
public class TwoDimesionArrayFind {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 8, 9}, {2, 3, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(twoDimensionArrayFind(arr, 7));
    }

    public static boolean twoDimensionArrayFind(int[][] arr, int target) {

        int row = 0;
        int col = arr[0].length - 1;   //二维数组列的长度arr[0].length
        while (row < arr.length && col >= 0) {
            if (arr[row][col] > target) {  //右上角元素>目标元素，当前列排除
                col--;
            } else if (arr[row][col] < target) {   //右上角元素<目标元素，当前行排除
                row++;
            } else if (arr[row][col] == target) {   //右上角元素==目标元素，直接返回true
                return true;
            }
        }
        return false;
    }

}
