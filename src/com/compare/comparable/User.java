package com.compare.comparable;

public class User implements Comparable<User> {
    String userName;
    Integer age;

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }


    @Override
    public int compareTo(User o) {
        return this.age - o.age;  //按照年龄  升序排序

//        return o.age-this.age   //按照年龄降序
//        return this.age.compareTo(o.age);  //方法二：同上
    }
}
