package com.onjava8.demo24;

/**
 * @Author: dongjie
 * @Date: 2021/6/9 11:14
 */
public class ManipulationTest {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(hf);
        manipulator.manipulate();
    }
}
