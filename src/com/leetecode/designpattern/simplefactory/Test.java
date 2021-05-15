package com.leetecode.designpattern.simplefactory;

public class Test {
    public static void main(String[] args) {
        Car tesla = GetCar.getCar("特斯拉");
        Car wuli = GetCar.getCar("五菱");
        tesla.name();
        wuli.name();
    }
}
