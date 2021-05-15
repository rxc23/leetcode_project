package com.leetecode.designpattern.abstractfactory;

public class ConcreteFactory implements AbstractFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }

    @Override
    public Phone getPhone() {
        return new XiaoMi();
    }
}
