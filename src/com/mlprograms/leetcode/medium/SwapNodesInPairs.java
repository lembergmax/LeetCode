package com.mlprograms.leetcode.medium;

import com.mlprograms.leetcode.helper.ListNode;

public class SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head) {
        ListNode dummyListNode = new ListNode(-1);
        dummyListNode.next = head;
        ListNode previousListNode = dummyListNode;

        while (previousListNode.next != null && previousListNode.next.next != null) {
            ListNode firstListNode = previousListNode.next;
            ListNode secondListNode = firstListNode.next;

            previousListNode.next = secondListNode;
            firstListNode.next = secondListNode.next;
            secondListNode.next = firstListNode;

            previousListNode = firstListNode;
        }

        return dummyListNode.next;
    }

    public static void main(String[] args) {
        ListNode listNode;

        listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println(swapPairs(listNode)); // Output: [2,1,4,3]

        listNode = new ListNode();
        System.out.println(swapPairs(listNode)); // Output: [0]

        listNode = new ListNode(1);
        System.out.println(swapPairs(listNode)); // Output: [1]

        listNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(swapPairs(listNode)); // Output: [2,1,3]
    }

}
