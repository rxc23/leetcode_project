package com.onjava8.demo23;

import java.util.ArrayList;

/**
 * @Author: dongjie
 * @Date: 2021/6/9 10:40
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c2 == c2);
    }
}
