package com.mlprograms.leetcode.hard;

import com.mlprograms.leetcode.helper.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MergeKSortedLists {

    public static ListNode mergeKLists(ListNode[] lists) {
        List<Integer> result = new ArrayList<>();

        for (ListNode listNode : lists) {
            result.addAll(toArrayList(listNode));
        }

        result = result.stream().filter(Objects::nonNull).sorted().toList();

        ListNode resultListNode = new ListNode(0);
        ListNode currentListNode = resultListNode;

        for (Integer num : result) {
            currentListNode.next = new ListNode(num);
            currentListNode = currentListNode.next;
        }

        return resultListNode.next;
    }

    private static List<Integer> toArrayList(ListNode node) {
        List<Integer> result = new ArrayList<>();
        ListNode currentNode = node;

        while (currentNode != null) {
            result.add(currentNode.val);
            currentNode = currentNode.next;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode[] listNodeList;

        listNodeList = new ListNode[]{
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))
        };
        System.out.println(mergeKLists(listNodeList)); // Output: [1,1,2,3,4,4,5,6]

        listNodeList = new ListNode[]{};
        System.out.println(mergeKLists(listNodeList)); // Output: []

        listNodeList = new ListNode[]{null};
        System.out.println(mergeKLists(listNodeList)); // Output: []
    }

}
