package com.leetecode.top100.queue;

import java.util.Stack;

public class MyQueue<Integer> {
    public MyQueue() {
    }

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(Integer value) { //往stack1中push元素
        stack1.push(value);
    }

    public Integer pop() { //stack2中pop元素
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }


}
