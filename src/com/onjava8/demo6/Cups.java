package com.onjava8.demo6;

/**
 * @Author: dongjie
 * @Date: 2021/6/3 17:18
 */
public class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}
