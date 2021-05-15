package com.staticlass;

public class Father {
    public Father() {
        System.out.println("父类无参构造方法");
    }

    static {
        System.out.println("父类静态代码块1");
    }

    private static int a = Help.fatherStaticMemberVarInit();

    static {
        System.out.println("父类静态代码块2");
    }

    {
        System.out.println("父类普通代码块1");
    }

    private int b = Help.fatherMemberVarInit();

    {
        System.out.println("父类普通代码块2");
    }

    public Father(int v) {
        System.out.println("父类带参构造方法");
    }
}
