package com.onjava8.demo8;

/**
 * @Author: dongjie
 * @Date: 2021/6/4 11:15
 */
public enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
    }
}


class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}