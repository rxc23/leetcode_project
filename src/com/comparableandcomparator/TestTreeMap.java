package com.comparableandcomparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>(new Comparator<String>() { //treemap只能根据key排序
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });


        map.put("f", 3);
        map.put("a", 1);
        map.put("c", 5);
        map.put("d", 6);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> m : entries) {
            System.out.println(m);
        }

    }

}
