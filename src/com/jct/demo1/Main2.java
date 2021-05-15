package com.jct.demo1;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main2 {
    Student s1 = new Student("张三", 1);
    Student s2 = new Student("张三", 1);
    Student s3 = new Student("李四", 2);
    Student s4 = new Student("王五", 3);

    @Test
    public void test() {
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        //
        /**重写equals()没有重写hashcode(),四个对象都添加进行：
         * com.jacrtech.demo1.Student@1b40d5f0
         * com.jacrtech.demo1.Student@3c5a99da
         * com.jacrtech.demo1.Student@47f37ef1
         * com.jacrtech.demo1.Student@ea4a92b
         */
        for (Student s : set) {
            System.out.println(s);
        }
        /**重写equals()也重写hashcode(),属性值相同的对象没有添加进行,只添加3个对象：
         * com.jacrtech.demo1.Student@1bb447b
         * com.jacrtech.demo1.Student@16e8df9
         * com.jacrtech.demo1.Student@18e5416
         */
    }

    @Test
    public void test1() {
        int[] arr = {1, 2, 3};
        //int >>> string
        System.out.println(String.valueOf(23));
        System.out.println(Integer.toString(23));
        //基本数据类型数组  >>>string
        System.out.println(Arrays.toString(arr));
    }


}
