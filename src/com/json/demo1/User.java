package com.json.demo1;

/**
 * @Author: dongjie
 * @Date: 2021/5/19 22:43
 */
public class User {
    private String userName;
    private Integer age;
    private String sex;


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
