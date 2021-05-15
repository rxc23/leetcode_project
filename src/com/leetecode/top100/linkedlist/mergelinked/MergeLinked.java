package com.leetecode.top100.linkedlist.mergelinked;

//合并两个有序单链表使合并之后依然是有序的
//1->3->5
//2->4->6
//得到：1->2->3->4->5->6
public class MergeLinked {
    class Node {
        Integer data;
        Node next;

        public Node(Integer data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {

    }

    public static Node mergeLinked(Node head1, Node head2) {
        if (head1 == null || head1.next == null) {
            return head1;
        } else if (head2 == null || head2.next == null) {
            return head2;
        }

        Node mergeNode = null;
        if (head1.data < head2.data) {
            mergeNode = head1;
            mergeNode.next = mergeLinked(head1.next, head2);//使用递归的做法
        } else {
            mergeNode = head2;
            mergeNode.next = mergeLinked(head1, head2.next);  //使用递归的做法
        }
        return mergeNode;
    }
}
