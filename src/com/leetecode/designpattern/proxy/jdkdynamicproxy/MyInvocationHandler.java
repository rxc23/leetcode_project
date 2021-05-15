package com.leetecode.designpattern.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


//创建一个类   implements  InvocationHandler
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    /**
     * @param proxy  代理的对象
     * @param method 执行的方法
     * @param args   参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
