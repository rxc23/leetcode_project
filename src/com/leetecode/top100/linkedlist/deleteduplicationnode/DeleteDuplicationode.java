package com.leetecode.top100.linkedlist.deleteduplicationnode;


import java.io.IOException;

//删除有序链表中重复的节点，不保留重复节点
//如：1->2->2->3->3->4->5
//得到：1->4->5
public class DeleteDuplicationode {
    static class Node {
        Integer data;
        Node next;

        public Node(Integer data) {
            this.data = data;
        }

    }

    public static void main(String[] args) throws IOException {


    }

    public static Node DeleteDuplicationode(Node head) {

        if (head.data == head.next.data) {//头结点与后面节点是重复节点
            Node currNode = head.next;
            while (currNode != null && currNode.data == head.data) {
                currNode = currNode.next;
            }
            return DeleteDuplicationode(currNode); //从下一个节点开始递归
        } else { //头结点与后面节点不是重复节点
            Node node = DeleteDuplicationode(head.next);  //从下一个节点开始递归
            return head;
        }

    }
}
