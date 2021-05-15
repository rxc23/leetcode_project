package com.leetecode.top100.linkedlist.printfromtailtohead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//从尾到头打印单链表值：使用栈实现或者数组实现
public class PrintFromTailToHead {
    static class Node {
        private Node next;
        private Integer data;

        public Node(Integer data) {
            this.data = data;
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());  //单链表结点个数
        int count = 0;
        Node head = new Node(count);
        Node curNode = head;
        while (curNode != null && count < num) {
            Node node = new Node(++count);
            curNode.next = node;
            curNode = node;

        }
        printFromTailToHead(head);


    }

    public static Node printFromTailToHead(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curNode = head;
        Stack<Integer> stack = new Stack<>();


        while (curNode != null) {
            stack.push((Integer) curNode.data);  //入栈操作
            curNode = curNode.next;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");   //出栈操作
        }

        return null;
    }
}

