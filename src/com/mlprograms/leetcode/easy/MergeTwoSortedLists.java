package com.mlprograms.leetcode.easy;

import com.mlprograms.leetcode.helper.ListNode;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }

        list2.next = mergeTwoLists(list1, list2.next);
        return list2;
    }

    public static void main(String[] args) {
        ListNode listNode1;
        ListNode listNode2;

        listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(ListNode.toString(mergeTwoLists(listNode1, listNode2)));

        listNode1 = new ListNode();
        listNode2 = new ListNode();
        System.out.println(ListNode.toString(mergeTwoLists(listNode1, listNode2)));

        listNode1 = new ListNode();
        listNode2 = new ListNode(0);
        System.out.println(ListNode.toString(mergeTwoLists(listNode1, listNode2)));
    }

}
