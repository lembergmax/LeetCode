package com.mlprograms.leetcode.medium;

import com.mlprograms.leetcode.helper.ListNode;

public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode dummy = res;

        for (int i = 0; i < n; i++) {
            head = head.next;
        }

        while (head != null) {
            head = head.next;
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;

        return res.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(ListNode.toString(removeNthFromEnd(head1, 2))); // [1, 2, 3, 5]

        ListNode head2 = new ListNode(1);
        System.out.println(ListNode.toString(removeNthFromEnd(head2, 1))); // []

        ListNode head3 = new ListNode(1, new ListNode(2));
        System.out.println(ListNode.toString(removeNthFromEnd(head3, 1))); // []
    }

}
