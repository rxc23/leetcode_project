package com.onjava8.demo21;

import java.util.stream.Stream;

/**
 * @Author: dongjie
 * @Date: 2021/6/9 9:15
 */
public class BasicSupplierDemo {
    public static void main(String[] args) {
        Stream.generate(
                BasicSupplier.create(CountedObject.class))
                .limit(5).forEach(System.out::println);
    }
}
