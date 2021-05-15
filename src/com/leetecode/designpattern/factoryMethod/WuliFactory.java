package com.leetecode.designpattern.factoryMethod;

public class WuliFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLi();
    }
}
