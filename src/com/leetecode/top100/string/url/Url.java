package com.leetecode.top100.string.url;

//将We are happy.中的空格替换成%20  ==>  We%20are%20happy.
public class Url {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceBlank(s));
    }

    public static String replaceBlank(String s) {
        if (s == null) {
            return s;
        }
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ') {   //如果字符是null，就替换掉
                stringBuffer.append("%20");
            } else {  //如果不是null，就添加到字符串中
                stringBuffer.append(s.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
