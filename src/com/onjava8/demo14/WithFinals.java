package com.onjava8.demo14;

/**
 * @Author: dongjie
 * @Date: 2021/6/4 15:45
 */
public class WithFinals {
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    // Also automatically "final":
    private void g() {
        System.out.println("WithFinals.g()");
    }
}
