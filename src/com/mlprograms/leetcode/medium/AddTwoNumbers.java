package com.mlprograms.leetcode.medium;

import com.mlprograms.leetcode.helper.ListNode;

// https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (listNode1 != null || listNode2 != null || carry != 0) {
            int digit1 = listNode1 != null ? listNode1.val : 0;
            int digit2 = listNode2 != null ? listNode2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            listNode1 = listNode1 != null ? listNode1.next : null;
            listNode2 = listNode2 != null ? listNode2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode1;
        ListNode listNode2;

        listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println(addTwoNumbers(listNode1, listNode2));    // [7,0,8]

        listNode1 = new ListNode(0);
        listNode2 = new ListNode(0);
        System.out.println(addTwoNumbers(listNode1, listNode2));    // [0]

        listNode1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        listNode2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        System.out.println(addTwoNumbers(listNode1, listNode2));    // [8,9,9,9,0,0,0,1]
    }

}
