package com.leetecode.top100.array.swapoddandeven;

//交换数组顺序使奇数位于偶数前面
//方法二：遍历数组得到奇数元素append();遍历数组得到奇数元素append()    时间复杂度 o(n2)
public class Main2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        swapEvenAndOdds(arr);
    }

    private static void swapEvenAndOdds(int[] arr) {
        if (arr == null) return;

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 1) {
                buffer.append(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) {
                buffer.append(arr[i]);
            }
        }

        char[] chars = buffer.toString().toCharArray();  //字符串转成数组
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
    }


}
