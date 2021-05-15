package com.staticlass;

/*
1.父类静态代码块
2.父类静态成员变量
3.子类静态代码块
4.子类静态成员变量
5.父类普通代码块
6.父类普通成员变量
7.父类构造方法
8.子类普通代码块
9.子类普通成员变量
10.子类构造方法

 注意点：
    静态内容只在类加载时执行一次，之后不再执行。
    默认调用父类的无参构造方法，可以在子类构造方法中利用super指定调用父类的哪个构造方法。

 */
public class Test {
    public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println("===================");
        Son son2 = new Son();
    }
}
