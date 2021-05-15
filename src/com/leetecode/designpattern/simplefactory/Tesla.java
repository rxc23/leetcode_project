package com.leetecode.designpattern.simplefactory;

public class Tesla implements Car {
    @Override
    public void name() {
        System.out.println("这是特斯拉");
    }
}
