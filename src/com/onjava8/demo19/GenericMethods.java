package com.onjava8.demo19;

/**
 * @Author: dongjie
 * @Date: 2021/6/8 11:29
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
