package com.jct.demo7;

import java.util.Arrays;

/**
 * lambda表达式实现compara按照string长度排序
 *
 * @Author: dongjie
 * @Date: 2021/5/13 11:27
 */
public class Main1 {
    public static void main(String[] args) {
        String[] name = {"peter", "mary", "kobe", "james"};
        Arrays.sort(name, (o1, o2) -> o1.length() - o2.length());
        for (String s : name) {
            System.out.println(s);
        }
    }
}
