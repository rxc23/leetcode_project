package com.onjava8.demo18;

import java.util.Random;

/**
 * @Author: dongjie
 * @Date: 2021/6/8 10:47
 */
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            Random random = new Random(47);
            System.out.println(random.nextInt(5));
        }
    }
}
