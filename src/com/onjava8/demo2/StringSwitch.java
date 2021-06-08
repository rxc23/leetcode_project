package com.onjava8.demo2;

import org.junit.Test;

/**
 * @Author: dongjie
 * @Date: 2021/6/3 10:34
 */
public class StringSwitch {
    @Test
    public void test1() {
        String color = "red";
        // 老的方式: 使用 if-then 判断
        if ("red".equals(color)) {
            System.out.println("RED");
        } else if ("green".equals(color)) {
            System.out.println("GREEN");
        } else if ("blue".equals(color)) {
            System.out.println("BLUE");
        } else if ("yellow".equals(color)) {
            System.out.println("YELLOW");
        } else {
            System.out.println("Unknown");
        }
    }


    /**
     * 新的方式
     */
    @Test
    public void test2() {
        String color = "red";
        switch (color) {
            case "red":
                System.out.println("RED");
                break;
            case "green":
                System.out.println("GREEN");
                break;
            case "blue":
                System.out.println("BLUE");
                break;
            case "yellow":
                System.out.println("YELLOW");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}

