package com.onjava8.demo3;

/**
 * @Author: dongjie
 * @Date: 2021/6/3 14:59
 */
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
//        new Nap(1); // One second delay
    }
}
