package com.leetecode.top100.string.repeatsubstring;

//判断字符串是否由重复的子串构成
public class RepeatSubstring {
    public static void main(String[] args) {

        System.out.println(repeatSubstring("abcabc"));
    }

    public static boolean repeatSubstring(String s) {
        String regex = "^[a-z]*$";  //以a-z开头和以a-z结尾，*表示0个/1个/多个

        if (s == null || s.length() == 0 || !s.matches(regex)) {
            return false;
        }

        for (int i = 0; i < s.length(); ++i) {
            String substring = s.substring(0, i);
            if (s.split(substring).length == 0) {
                return true;
            }

        }
        return false;

    }

}
