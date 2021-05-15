package com.staticlass;

class Son extends Father {
    static {
        System.out.println("子类静态代码块1");
    }

    private static int a = Help.sonStaticMemberVarInit();

    static {
        System.out.println("子类静态代码块2");
    }

    {
        System.out.println("子类普通代码块1");
    }

    private int b = Help.sonMemberVarInit();

    {
        System.out.println("子类普通代码块2");
    }

    public Son() {
        // super(2018);
        System.out.println("子类构造方法");
    }
}