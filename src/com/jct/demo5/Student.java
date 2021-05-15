package com.jct.demo5;


import org.junit.Test;

/**
 * 类优先规则
 *
 * @Author: 董杰
 * @Date:2021/5/13 11:17
 */
public class Student extends Person implements Name {
    @Test
    @Override
    public void getName() {
        super.getName();  //---
    }
}
