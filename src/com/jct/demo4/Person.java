package com.jct.demo4;

public interface Person {
    default void getName() {
        System.out.println("----");
    }
}
