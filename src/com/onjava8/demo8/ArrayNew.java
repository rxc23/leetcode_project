package com.onjava8.demo8;

import java.util.Arrays;
import java.util.Random;

/**
 * 想要获取一个范围内的随机数（例如26，随机数可能是0-25），首先需要一个种子（其实就是一个数值）。
 * 每个种子会对应这个范围内（0-26）的唯一的一个随机数。
 * 47这个种子在26这个范围内，所对应的随机数为24，所以每次随机得出的结果都为24.
 * （注意：47在26这个范围内对应的是24，这个是死的，固定的，无论你执行多少次，它还是24）
 * 至于为什么种子47会对应24，这个涉及到java封装的算法，有兴趣可以深入了解。
 *
 * @Author: dongjie
 * @Date: 2021/6/4 10:34
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
