package com.leetecode.top100.array.fobo;

//斐波那契数列（递归求解）
//特征：该数=它的前两个数之和
public class Fob {
    public static void main(String[] args) {
        System.out.println(fob(0));
    }

    public static int fob(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fob(n - 1) + fob(n - 2);
    }

}
