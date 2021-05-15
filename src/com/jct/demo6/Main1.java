package com.jct.demo6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * compartor<T>接口的实现,按照字符串长度递增排序
 *
 * @Author: dongjie
 * @Date: 2021/5/13 11:27
 */
public class Main1 {
    public static void main(String[] args) {
        String[] name = {"peter", "mary", "kobe", "james"};
        Arrays.sort(name, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for (String s : name) {
            System.out.println(s);
        }

    }
}
