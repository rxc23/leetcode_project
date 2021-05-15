package com.leetecode.designpattern.factoryMethod;

public class Test {
    public static void main(String[] args) {
        Car tesla = new TeslaFactory().getCar();
        Car wuli = new WuliFactory().getCar();
        tesla.name();
        wuli.name();
    }
}
