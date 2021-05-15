package com.leetecode.top100.linkedlist.reverselinkednode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//单链表反转
public class ReverseLinkedNode {
    static class Node {
        private Node next;
        private Integer data;

        public Node(Integer data) {
            this.data = data;
        }

    }

    public static Node reverseLinkedNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        //定义三个节点：前，当前，后
        Node preNode = null;
        Node currNode = head;
        Node nextNode = null;

        //当前节点不为空就循环
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        return preNode;
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

        Node rlNode = reverseLinkedNode(head); //单链表反转

        while (rlNode != null) {  //输出反转后的单链表
            System.out.print(rlNode.data + "->");
            rlNode = rlNode.next;
        }


    }
}
