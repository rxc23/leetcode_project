package com.leetecode.dongjie.randomizedcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RandomizedCollection {
    public static void main(String[] args) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        map.put(0, set);
        map.put(1, set);
        System.out.println(map);
//        System.out.println(insert());
    }

    public static boolean insert(int val) {
        ArrayList<Object> list = new ArrayList<>();

        boolean flag = true;
        return flag;
    }
}
