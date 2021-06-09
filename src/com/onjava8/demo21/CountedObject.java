package com.onjava8.demo21;

/**
 * @Author: dongjie
 * @Date: 2021/6/9 9:15
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
