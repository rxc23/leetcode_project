package com.leetecode.designpattern.singleton;

//非线程安全
public class Lazzy {
    //一开始不创建对象，需要的时候再创建对象
    private static Lazzy l = null;

    private Lazzy() {
    }

    public static Lazzy getInstance() {
        if (l == null) {
            l = new Lazzy();
        }
        return l;
    }

    public static void main(String[] args) {

    }
}
