package com.leetecode.designpattern.singleton;

//饿汉式
public class Hungry {
    //一开始就初始化对象
    private static final Hungry h = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance() {
        return h;
    }

    public static void main(String[] args) {
        Hungry instance1 = Hungry.getInstance();
        Hungry instance2 = Hungry.getInstance();
        System.out.println(instance1 == instance2);
    }
}
