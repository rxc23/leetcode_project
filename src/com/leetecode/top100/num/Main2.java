package com.leetecode.top100.num;

/**
 * @Author: dongjie
 * @Date: 2021/6/3 19:17
 */
public class Main2 {
    public static void main(String[] args) {
        Main2 m1 = new Main2();
//        m1.printToMaxOfDigits(-10);
//        m1.printToMaxOfDigits(0);
        m1.printToMaxOfDigits(3);
//        m1.printToMaxOfDigits(100);
    }

    //打印1到最大的n位数
    public void printToMaxOfDigits(int n) {
        if (n <= 0) {
            System.out.println("输入的n没有意义");
            return;
        }
        //声明字符数组,用来存放一个大数
        char number[] = new char[n];
        for (int i = 0; i < number.length; ++i) { //放字符0进行初始化
            number[i] = '0';
        }
        while (!incrementNumber(number)) { //如果大数自加，直到自溢退出
            printNumber(number); //打印大数
        }
    }

    //自加
    private boolean incrementNumber(char[] number) {
        boolean isOverflow = false; //判断是否溢出
        int nTakeOver = 0; //判断是否进位
        int nLength = number.length;
        for (int i = nLength - 1; i >= 0; --i) {
            int nSum = number[i] - '0' + nTakeOver; //取到第i位的字符转换为数字 +进位符
//            int nSum = number[i]  + nTakeOver;
            System.out.println("nSum:" + nSum);
            if (i == nLength - 1) { //末尾自加1
                ++nSum;
            }
            if (nSum >= 10) {
                if (i == 0) {
                    isOverflow = true;
                } else {
                    nSum -= 10;
                    nTakeOver = 1;
                    number[i] = (char) ('0' + nSum);
                }
            } else {
                number[i] = (char) (nSum + '0');
//                number[i] = (char) (nSum);
                break;
            }
        }
        return isOverflow;
    }

    //打印数字
    private void printNumber(char[] number) {
        boolean isBeginning0 = true;
        int nLength = number.length;
        for (int i = 0; i < nLength; ++i) {
            if (isBeginning0 && number[i] != '0') {
                isBeginning0 = false;
            }
            if (!isBeginning0) {
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }
}
