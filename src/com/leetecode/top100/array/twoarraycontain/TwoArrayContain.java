package com.leetecode.top100.array.twoarraycontain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

//求两个数组的交集（重复元素只显示一次）
//arr1=[1,2,3,4,5,4,5,5]
//arr2=[3,4,5]
//arr=[3,4,5]
public class TwoArrayContain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().trim().split(" ");
        String[] str2 = br.readLine().trim().split(" ");
        System.out.println(twoArrayContain(str1, str2));
    }

    public static HashSet<String> twoArrayContain(String[] str1, String[] str2) {
        if (str1 == null || str2 == null) {
            return null;
        }
        HashSet<String> set = new HashSet<>(Arrays.asList(str1));
        set.retainAll(Arrays.asList(str2));//取交集方法retainAll()；如果存在交集元素，set保存交集；否则set是空
        return set;
    }
}
