package com.leetecode.designpattern.singleton;

//线程安全，懒汉式
public class Lazzy2 {
    private static Lazzy2 l = null;

    private Lazzy2() {
    }

    public static Lazzy2 getInstance() {
        if (l == null) {
            synchronized (Lazzy2.class) {
                if (l == null) {
                    l = new Lazzy2();
                }
            }
        }
        return l;
    }
}
