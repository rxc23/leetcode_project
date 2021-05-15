package com.jct.demo8;

import java.util.Arrays;

/**
 * lambda表达式之方法引用
 *
 * @Author: dongjie
 * @Date: 2021/5/13 15:22
 */
public class Main1 {
    public static void main(String[] args) {
        String[] name = {"marry", "peter", "james", "kobe", "wede"};
        Arrays.sort(name, String::compareToIgnoreCase); //按照字典顺序比较字符串大小且忽略大小写
//        Arrays.sort(name,(x,y)->x.compareToIgnoreCase(y));
        for (String s : name) {
            System.out.println(s);
        }

    }
}
