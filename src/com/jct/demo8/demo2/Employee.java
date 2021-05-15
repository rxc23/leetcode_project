package com.jct.demo8.demo2;

/**
 * @Author: dongjie
 * @Date: 2021/5/15 15:58
 */
public class Employee {
    private String name;
    private Integer age;
    private float price;


    public Employee(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public float getPrice() {
        return price;
    }


}
