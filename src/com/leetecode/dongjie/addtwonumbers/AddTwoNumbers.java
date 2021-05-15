package com.leetecode.dongjie.addtwonumbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        //创建两个节点l1,l2
        ListNode l1 = new ListNode(2);
        ListNode l1Head = l1;
        ListNode l2 = new ListNode(5);
        ListNode l2Head = l2;
        l1.next = new ListNode(4);
        l2.next = new ListNode(6);
        l1 = l1.next;
        l2 = l2.next;
        l1.next = new ListNode(5);
        l2.next = new ListNode(4);
        ListNode resultNode = addTwoNumbers(l1Head, l2Head);
        while (resultNode != null) {
            System.out.print(resultNode.val);
            resultNode = resultNode.next;
        }

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;


    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
