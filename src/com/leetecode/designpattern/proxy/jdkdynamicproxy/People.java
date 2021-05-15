package com.leetecode.designpattern.proxy.jdkdynamicproxy;

//被代理的对象
public class People implements IPeople {
    @Override
    public void fun() {
        System.out.println("这是fun方法");
    }
}
