package com.onjava8.demo24;

/**
 * @Author: dongjie
 * @Date: 2021/6/9 11:12
 */

/**
 * 使用extends给泛型一个边界
 *
 * @param <T>
 */
public class Manipulator<T extends HasF> {
    private T obj;

    Manipulator(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
}
