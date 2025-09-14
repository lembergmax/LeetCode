package com.mlprograms.leetcode.helper;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        ListNode currentNode = this;
        while (currentNode != null) {
            stringBuilder.append(currentNode.val);
            if (currentNode.next != null) {
                stringBuilder.append(",");
            }
            currentNode = currentNode.next;
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static String toString(ListNode node) {
        return node == null ? "[]" : node.toString();
    }

}
