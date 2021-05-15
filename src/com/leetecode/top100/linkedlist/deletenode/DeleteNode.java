package com.leetecode.top100.linkedlist.deletenode;


import java.io.IOException;

//给定头结点head和指定节点的指针removenode，请删除指定指针的节点
public class DeleteNode {
    static class Node {
        Integer data;
        Node next;

        public Node(Integer data) {
            this.data = data;
        }

    }

    public static void main(String[] args) throws IOException {


    }

    public static Node removeDeleteNode(Node head, Node removeNode) {
        if (head == null || head.next == null || removeNode == null || removeNode.next == null) {
            return head;
        }
        //有多个节点，要删除节点是中间节点
        if (removeNode.next != null) {
            Node p = removeNode.next;
            removeNode.data = p.data;
            removeNode.next = p.next;
            //删除p节点---伪代码
            return head;
        }
        //只有一个节点，要删除节点既是头结点也是尾结点
        if (head == removeNode) {
            //直接删除removeNode--伪代码
            return head;
        }
        //有多个节点，要删除节点是尾结点
        Node currNode = head;
        while (currNode.next != removeNode) {
            currNode = currNode.next;

        }
        //直接删除removeNode---伪代码
        currNode.next = null;
        return head;
    }
}
