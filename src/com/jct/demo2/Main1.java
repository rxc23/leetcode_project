package com.jct.demo2;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        int i = 0;
//        System.out.println(i instanceof Integer);  //编译 不通过
//        System.out.println(i instanceof Object);   //编译不通过，instanceof只能作用于对象的判断
        System.out.println(null instanceof Object);  //false
        System.out.println(null instanceof Integer); //false

        Integer integer = new Integer(1);
        System.out.println(integer instanceof Integer);  //true

        ArrayList<Object> list = new ArrayList<>();
        System.out.println(list instanceof List);  //true

        Person p1 = new Person();
        Person p2 = new Man();
        Man man = new Man();
        System.out.println(p1 instanceof Man); //false
        System.out.println(p2 instanceof Man); //true
        System.out.println(man instanceof Man); //true

    }
}
