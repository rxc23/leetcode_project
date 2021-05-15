package com.leetecode.dongjie.threeconsecutiveodds;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println(threeConsecutiveOdds(arr));
    }


    public static boolean threeConsecutiveOdds(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 2; i++) {
            //外层循环，outer标签标示外层循环
            outer:
            for (int j = i + 1; j < arr.length - 1; ++j) {
                for (int k = j + 1; k < arr.length; ++k) {
                    if (arr[i] % 2 == 1 && arr[j] % 2 == 1 && arr[k] % 2 == 1) return flag;
                    break;
                }
                break outer;
            }
        }

        return false;
    }
}
