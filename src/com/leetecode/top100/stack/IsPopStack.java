package com.leetecode.top100.stack;


import java.util.Stack;

//栈的压入弹出序列
//例如：压入序列{1,2,3,4,5}   弹出序列{4,3,5,1,2}
public class IsPopStack {
    public static void main(String[] args) {
        int popStack[] = {4, 5, 3, 2, 1};     //出栈序列
        int pushStack[] = {1, 2, 3, 4, 5};    //入栈元素
        Stack<Integer> stack = new Stack<>();
        System.out.println(isStack(popStack, pushStack, stack));
    }

    public static boolean isStack(int popStack[], int pushStack[], Stack<Integer> stack) {
        if (popStack == null || pushStack == null) {
            return false;
        }

        int j = 0;
        for (int i = 0; i < popStack.length; ++i) {
            stack.push(pushStack[i]);
            while (!stack.isEmpty() && stack.peek() == popStack[j]) { //栈定

                stack.pop();
                j++;
            }

        }
        return popStack.length == j;


    }
}
