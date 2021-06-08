package com.onjava8.demo12;

/**
 * @Author: dongjie
 * @Date: 2021/6/4 14:32
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
