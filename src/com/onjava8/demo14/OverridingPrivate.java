package com.onjava8.demo14;

/**
 * @Author: dongjie
 * @Date: 2021/6/4 15:46
 */
public class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}
