package com.mlprograms.leetcode.hard;

import com.mlprograms.leetcode.helper.ListNode;

// https://leetcode.com/problems/reverse-nodes-in-k-group/
public class ReverseNodesInKGroup {

    public static ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode currentListNode = head;

        while (currentListNode != null) {
            currentListNode = currentListNode.next;
            count++;
        }

        return reverseNSteps(head, k, 0, count);
    }

    private static ListNode reverseNSteps(ListNode head, int k, int seen, int total) {
        if (head == null || total - seen < k) {
            return head;
        }

        ListNode previousListNode = null;
        ListNode currentListNode = head;
        int counter = 0;

        while (currentListNode != null && counter < k) {
            ListNode currNext = currentListNode.next;
            currentListNode.next = previousListNode;
            previousListNode = currentListNode;
            currentListNode = currNext;
            counter++;
        }

        ListNode nextListNodeHead = currentListNode;
        head.next = reverseNSteps(nextListNodeHead, k, seen + k, total);
        return previousListNode;
    }

    public static void main(String[] args) {
        ListNode listNode;

        listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(ListNode.toString(reverseKGroup(listNode, 2))); // [2,1,4,3,5]

        listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(ListNode.toString(reverseKGroup(listNode, 3))); // [3,2,1,4,5]
    }

}
