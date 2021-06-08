package com.onjava8.demo6;

/**
 * @Author: dongjie
 * @Date: 2021/6/3 17:19
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99); // [1]

    }

//    static Cups cups1 = new Cups(); // [2]
//    static Cups cups2 = new Cups(); // [2]
}
