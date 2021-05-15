package com.leetecode.top100.linkedlist.createnode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateNode {
    static class Node {
        Integer value;
        Node next;

        public Node(Integer value) {
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    //单链表结点个数
        int count = 0;
        Node head = new Node(count);
        Node curNode = head;
        if (curNode == null) {
            return;
        }

        while (curNode != null && count < n) {
            Node node = new Node(++count);
            curNode.next = node;
            curNode = node;
        }

        while (head != null) {
            System.out.print(head.value + "->");
            head = head.next;
        }
    }
}
