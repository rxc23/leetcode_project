package com.staticlass;

public class Help {
    public static int fatherStaticMemberVarInit() {
        System.out.println("父类静态成员变量");
        return 0;
    }

    public static int fatherMemberVarInit() {
        System.out.println("父类普通成员变量");
        return 0;
    }

    public static int sonStaticMemberVarInit() {
        System.out.println("子类静态成员变量");
        return 0;
    }

    public static int sonMemberVarInit() {
        System.out.println("子类普通成员变量");
        return 0;
    }
}
