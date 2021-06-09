package com.onjava8.demo19;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dongjie
 * @Date: 2021/6/8 11:37
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        ArrayList<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }

        return result;
    }


    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList(
                "ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}
