package com.leetecode.top100.linkedlist.findkthtofail;

//打印出链表中倒数第k个节点的值
public class FindKthToTail {
    class Node {
        private Integer data;
        private Node next;

        public Node(Integer data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {

    }

    public static Node findKthToTail(Node node, int k) {
        if (node == null || node.next == null || k == 0) {//如果头结点==null或者k=0
            return null;
        }

        Node head1 = node;
        Node head2 = head1;

        for (int i = 0; i < k - 1; ++i) {
            if (head1.next != null) {//K>链表长度
                head1 = head1.next;
            } else {
                return null;
            }
        }

        while (head1.next != null) {
            head1 = head1.next;
            head2 = head2.next;
        }

        return head2;
    }

}
