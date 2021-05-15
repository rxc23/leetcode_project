package com.jct.demo1;

public class Main1 {
    public static void main(String[] args) {
        Integer a = 1, b = 1, c = 2;
        Student s1 = new Student("张三", 1);
        Student s2 = new Student("李四", 2);
        Student s3 = new Student("张三", 1);
        System.out.println("---------------使用object中的equals()------------");
        System.out.println(s1 == s3);  //false
        System.out.println(s1.equals(s3));  //false
//        s1的hashcode：495053715s3的hashcode：1922154895
        System.out.println("s1的hashcode：" + s1.hashCode() + "   s3的hashcode：" + s3.hashCode());
        System.out.println("--------------------");
        System.out.println(a.equals(b)); //true
        System.out.println(a.equals(c)); //false
        System.out.println(s1.thisBoolean(s1)); //s1等于this，地址值相等  com.jacrtech.demo1.Student@1d81eb93
        System.out.println(s1);  //com.jacrtech.demo1.Student@1d81eb93

        System.out.println("--------使用自己的equals()------------");
        System.out.println(s1.equals(s3)); //true
//        s1的hashcode：24022521  s3的hashcode：24022521
//        System.out.println("--------使用自己的hashcode()------------------");
//        System.out.println("s1的hashcode："+s1.hashCode()+"  s3的hashcode："+s3.hashCode());
        System.out.println("--------使用object的hashcode()------------------");
//        s1的hashcode：495053715  s3的hashcode：1922154895   不符合对象相等，hashcode也相等
        System.out.println("s1的hashcode：" + s1.hashCode() + "  s3的hashcode：" + s3.hashCode());
        System.out.println(s1.equals(s2)); //false


    }

}
