package com.jct.demo1;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object thisBoolean(Object o) {  //自己定义的方法
        return this;
    }


    @Override
    public boolean equals(Object o) {  //自己定义的equals()
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() { //自己定义的hashcode()
        return Objects.hash(name, age);
    }
}
