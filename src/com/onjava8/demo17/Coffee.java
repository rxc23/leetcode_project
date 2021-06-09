package com.onjava8.demo17;

/**
 * @Author: dongjie
 * @Date: 2021/6/8 10:29
 */
public class Coffee {

    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
