package com.leetecode.dongjie.lengthoflongestsubstring;

import java.util.HashSet;
import java.util.Set;

/*
 * 2020-9-2    无重复字符的最长子串
 *
 * */

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("bbbbb");
        System.out.println(i);
    }


    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); ++i) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); ++j) {
                if (set.contains(s.charAt(j))) break;
                len = Math.max(len, j - i + 1);
                set.add(s.charAt(j));
            }
        }

        return len;
    }
}
