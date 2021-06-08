package com.leetecode.top100.stack;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: dongjie
 * @Date: 2021/6/2 0:03
 */
public class Main1 {
    /**
     * 创建数据栈和辅助栈
     */
    private static Stack<Integer> dataStack = new Stack();
    private static Stack<Integer> assitStack = new Stack<>();
    private static Integer temp = null;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        String[] split = scanner.nextLine().trim().split(",");
        for (String s : split) {
            push(Integer.parseInt(s));
        }

//        pop();
        min();

    }

    /**
     * 栈的最小元素
     */
    private static void min() {
        System.out.println("最小元素：" + assitStack.peek());
    }

    /**
     * 出栈
     */
//    private static void pop() {
//        System.out.println("出栈元素：");
//        while(!assitStack.isEmpty()){
//            System.out.print(assitStack.pop()+" ");
//        }
//
//    }

    /**
     * 压栈
     *
     * @param num
     */
    private static void push(int num) {
        if (temp != null) {
            if (num <= temp) {
                dataStack.push(num);
                assitStack.push(num);
                temp = num;
            } else {
                dataStack.push(num);
            }
        } else {
            dataStack.push(num);
            assitStack.push(num);
            temp = num;
        }
    }
}
