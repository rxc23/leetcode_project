package com.onjava8.demo14;

/**
 * @Author: dongjie
 * @Date: 2021/6/4 15:53
 */
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
//        方法私有的不能访问
//        op.f();
//        op.g();
        WithFinals wf = op2;
//        方法私有的不能访问
//        wf.f();
//        wf.g();
    }
}
