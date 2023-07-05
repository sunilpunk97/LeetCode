package com.java.leetcode.LinkedList;
import java.util.LinkedList;

public class LinedListCycle_141 {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null)
                return false;
            slow = slow.next ;
            fast = fast.next.next;
        }
        return true; //added
    }
}
//
//Algo:
//        If the input linked list is empty, return false, since it cannot have a cycle.
//
//        Set two pointers slow and fast to the head node and the node next to the head node, respectively.
//
//        In a while loop, move the slow pointer one step at a time and the fast pointer two steps at a time until they meet or the fast pointer reaches the end of the list.
//
//        If the fast pointer reaches the end of the list, there is no cycle in the list, so return false.
//
//        If the slow and fast pointers meet, there is a cycle in the list, so return true.
