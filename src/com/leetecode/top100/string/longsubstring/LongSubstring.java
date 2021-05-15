package com.leetecode.top100.string.longsubstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class LongSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); //输入字符串
        System.out.println(longSubstring(str));

    }

    public static int longSubstring(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int i = 0, count = 0, j = 0;
        HashSet<Character> set = new HashSet<>();
        while (i < str.length()) {
            if (!set.contains(str.charAt(i))) {   //集合不包含该元素
                set.add(str.charAt(i));
                count = Math.max(set.size(), count);
                i++;
            } else { //集合中包含该元素
                set.remove(str.charAt(j));
                j++;
            }
        }
        return count;
    }
}
