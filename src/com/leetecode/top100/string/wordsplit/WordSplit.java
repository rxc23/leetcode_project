package com.leetecode.top100.string.wordsplit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//入参：“123 abcd”；返回： “321 dcba”
public class WordSplit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] srr = br.readLine().trim().split(" ");//输入字符串
        if (srr.length == 0 || srr == null) {
            return;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < srr.length; ++i) {
            for (int j = 0; j < srr[i].length(); ++j) {
                stack.push(srr[i].charAt(j));
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.print(" ");
        }


    }
}
