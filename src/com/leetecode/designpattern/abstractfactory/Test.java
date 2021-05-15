package com.leetecode.designpattern.abstractfactory;

public class Test {
    public static void main(String[] args) {
        Car tesla = new ConcreteFactory().getCar();
        tesla.name();
        Phone xiaoMi = new ConcreteFactory().getPhone();
        xiaoMi.name();
    }
}
