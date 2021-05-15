package com.leetecode.top100.string.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//将字符串反转
public class Str {
    public static void main(String[] args) throws IOException {

        //方式一
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); //输入字符串
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); ++i) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        //方式二
//        System.out.println(new StringBuffer("hello is world").reverse().toString());
    }
}
