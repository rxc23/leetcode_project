package com.leetecode.designpattern.singleton;

public class Lazzy3 {
    private static volatile Lazzy3 l = null;

    private Lazzy3() {
    }

    public static Lazzy3 getInstance() {
        if (l == null) {
            synchronized (Lazzy3.class) {
                if (l == null) {
                    l = new Lazzy3();
                }
            }
        }
        return l;
    }
}
