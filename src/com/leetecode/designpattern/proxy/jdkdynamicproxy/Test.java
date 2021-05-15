package com.leetecode.designpattern.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //定义一个people作为被代理对象
        IPeople people = new People();
        //定义一个hander对象
        InvocationHandler hander = new MyInvocationHandler(people);
        //产生一个动态代理
        IPeople p = (IPeople) Proxy.newProxyInstance(people.getClass().getClassLoader(), new Class[]{IPeople.class}, hander);
        p.fun();
    }
}
