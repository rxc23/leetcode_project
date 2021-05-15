package com.leetecode.top100.linkedlist.hascycle;

import java.util.HashSet;

public class HasCyc {
    class Node {
        private Integer data;
        private Node next;

        public Node(Integer data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

    }

    public boolean hasCyc(Node node) {
        if (node == null || node.next == null) {
            return false;
        }

        HashSet<Node> set = new HashSet<>();
        Node head = node;
        while (head != null) {
            if (set.contains(head)) {  //set中包含单链表结点
                return true;
            } else {  //set中不包含单链表结点，添加节点，head往后走
                set.add(head);
                head = head.next;
            }
        }

        return false;
    }

}
