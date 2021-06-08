package com.onjava8.demo4;

/**
 * @Author: dongjie
 * @Date: 2021/6/3 16:01
 */
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f(); // Shows that construction is done
    }
}
