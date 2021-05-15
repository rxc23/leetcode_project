package com.leetecode.top100.other.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

//LRU算法
public class LRU {
    private static int size = 5; //初试容量大小

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>(size, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > size;
            }
        };

        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        System.out.println(map);

        map.put("5", "5");
        System.out.println(map);

        map.get("3");
        System.out.println(map);

        map.get("5");
        System.out.println(map);


    }
}
