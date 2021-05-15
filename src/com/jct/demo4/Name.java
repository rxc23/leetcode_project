package com.jct.demo4;

public interface Name {
    default void getName() {
        System.out.println("张三");
    }
}
