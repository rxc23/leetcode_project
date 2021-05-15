package com.jct.demo4;

import org.junit.Test;

/**
 * 实现类解决接口默认方法冲突
 *
 * @Author: 董杰
 * @Date:2021/5/13 11:06
 */
public class Student implements Person, Name {

    @Test
    @Override
    public void getName() {
        Person.super.getName(); //----
        Name.super.getName();   //张三
    }

}
