package com.onjava8.demo25;

/**
 * @Author: dongjie
 * @Date: 2021/6/9 11:34
 */
public class GenericBase<T> {
    private T element;

    public void set(T arg) {
        element = arg;
    }

    public T get() {
        return element;
    }
}

class Derived1<T> extends GenericBase<T> {
}

class Derived2 extends GenericBase {
} // No warning

class ErasureAndInteritance {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        d2.set(obj); // Warning here!
    }
}