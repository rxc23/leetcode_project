package com.leetecode.designpattern.simplefactory;

public class GetCar {
    public static Car getCar(String car) {
        if (car.equals("特斯拉")) {
            return new Tesla();
        } else if (car.equals("五菱")) {
            return new Wuli();
        } else
            return null;
    }
}
