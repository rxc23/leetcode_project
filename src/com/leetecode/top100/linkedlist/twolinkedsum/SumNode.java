package com.leetecode.top100.linkedlist.twolinkedsum;

//没写完
public class SumNode {
    static class Node {
        Integer value;
        Node next;

        public Node(Integer value) {
            this.value = value;
        }

        public int length(Node node) {
            if (node == null) {
                return 0;
            }
            int count = 0;
            while (node != null) {
                count++;
                node = node.next;
            }
            return count;
        }


    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(1);
        Node node3 = new Node(5);
        Node nodea = new Node(5);
        Node nodeb = new Node(9);
        Node nodec = new Node(2);
        node1.next = node2;
        node2.next = node3;
        nodea.next = nodeb;
        nodeb.next = nodec;
        sumLinked(node1, nodea);
    }

    public static Node sumLinked(Node node1, Node nodea) {
        if (node1 == null && nodea == null) return null;

        Node head1 = node1;
        Node head2 = nodea;
        while (node1 != null || nodea != null) {
            int sum = node1.value + nodea.value;
            if (node1.length(node1) > nodea.length(nodea)) { //node1长度>nodea长度
                if (sum > 10 && node1.next.next == null) {
                    node1.value = sum % 10;
                    node1.next.value = node1.next.value + 1;
                    if (node1.next.value > 10) {
                        node1.next.value = node1.next.value % 10;
                        Node newNode = new Node(1);
                    }
                } else if (sum >= 10) {
                    node1.value = sum;
                    node1 = node1.next;
                    nodea = nodea.next;
                } else if (node1.length(node1) < nodea.length(nodea)) {
                    if (sum > 10 && nodea.next.next == null) {
                        nodea.value = sum % 10;
                        nodea.next.value = nodea.next.value + 1;
                        if (nodea.next.value > 10) {
                            nodea.next.value = nodea.next.value % 10;
                            Node newNode = new Node(1);
                        }
                    } else if (sum >= 10) {
                        nodea.value = sum;
                        nodea = nodea.next;
                        node1 = node1.next;
                    } else if (node1.length(node1) == nodea.length(nodea)) {
                        if (node1.next == null && nodea.next == null && sum > 10) {
                            node1.value = sum % 10;
                            Node newNode = new Node(1);
                        }
                        if (sum >= 10) {
                            node1.value = sum % 10;
                            node1.next.value = node1.next.value + 1;
                            node1 = node1.next;
                            nodea = nodea.next;
                        } else {
                            node1.value = sum;
                            node1 = node1.next;
                            nodea = nodea.next;
                        }
                    }
                }
            } else {

            }
        }


        return null;
    }
}

