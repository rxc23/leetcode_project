package com.leetecode.examination.thoughtwork.countreplicationword;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//计算重复单词的数量
//输入：I am so amazed by the sheer excellence of this boy,I am so so so grateful for this.    so
//输出：4
public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String newStr = line.replaceAll("[\\.,]", " "); //匹配，或者.
        String[] word = newStr.trim().split(" "); //匹配空格
        String targetWord = br.readLine();
        System.out.println(countRepliCount(word, targetWord));
    }


    private static int countRepliCount(String[] word, String targetWord) {
        int count = 0;
        for (int i = 0; i < word.length; ++i) {
            if (word[i].equals(targetWord)) {
                count++;
            }
        }
        return count;
    }

}
