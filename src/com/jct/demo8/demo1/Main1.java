package com.jct.demo8.demo1;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * lambda
 *
 * @Author: dongjie
 * @Date: 2021/5/15 10:56
 */
public class Main1 {
    /**
     * Lists.newArrayList
     * 方法引用
     * 遍历集合
     */
    @Test
    public void test1() {
        Person p1 = new Person("zhangsan", 12, "male");
        Person p2 = new Person("lisi", 14, "male");
        Person p3 = new Person("wangwu", 21, "female");
        List<Person> list = Lists.newArrayList(p1, p2, p3);
        list.forEach(person -> System.out.println(person.toString()));
        System.out.println("--------------------");
        list.forEach(person -> System.out.println(person.toString()));
    }


    /**
     * filter对集合过滤
     * 过滤年龄大于12
     */
    @Test
    public void test2() {
        Person p1 = new Person("zhangsan", 12, "male");
        Person p2 = new Person("lisi", 14, "male");
        Person p3 = new Person("wangwu", 21, "female");
        List<Person> list = Lists.newArrayList(p1, p2, p3);
        Collections2.filter(list, person -> person.getAge() > 12).
                forEach(person -> System.out.println(person.toString()));

    }

    /**
     * 多条件过滤
     * 年龄>12且女性
     *
     */
    @Test
    public void test3() {
        Person p1 = new Person("zhangsan", 12, "male");
        Person p2 = new Person("lisi", 14, "male");
        Person p3 = new Person("wangwu", 21, "female");
        ArrayList<Person> list = Lists.newArrayList(p1, p2, p3);
        //lmabda表达式取反->!
        Collections2.filter(list, person -> person.getAge() > 12).stream().
                filter(person -> !person.getSex().equalsIgnoreCase("male"))
                .forEach(person -> System.out.println(person.toString()));

    }

    /**
     * 限制数据集的数据量
     */
    @Test
    public void test4() {
        Person p1 = new Person("zhangsan", 12, "male");
        Person p2 = new Person("lisi", 14, "male");
        Person p3 = new Person("wangwu", 21, "female");
        ArrayList<Person> list = Lists.newArrayList(p1, p2, p3);
        list.stream().limit(2).forEach(person -> System.out.println(person.toString()));
        System.out.println("-----------------------");
        list.stream().limit(3).filter(person -> person.getName().
                equalsIgnoreCase("zhangsan")).forEach(person -> System.out.println(
                person.toString()
        ));
    }

    /**
     * 排序
     */
    @Test
    public void test5() {
        Person p1 = new Person("zhangsan", 12, "male");
        Person p2 = new Person("lisi", 14, "male");
        Person p3 = new Person("wangwu", 21, "female");
        List<Person> list = Lists.newArrayList(p1, p2, p3);
        System.out.println("--------------按照年龄大小排序--------------");
        list.stream().sorted((person1, person2) -> person1.getAge() - person2.getAge())
                .forEach(person -> System.out.println(person.toString()));
        System.out.println("----------按照名字字典顺序排序--------------");
        list.stream().sorted((person1, person2) -> person1.getName().compareToIgnoreCase(person2.getName()))
                .forEach(person -> System.out.println(person.toString()));
        System.out.println("------------按照名字长度排序");
        list.stream().sorted((person1, person2) -> person1.getName().length() - person2.getName().length())
                .forEach(person -> System.out.println(person.toString()));

    }
}
