package com.jct.demo5;

public interface Name {
    default void getName() {
        System.out.println("张三");
    }
}
