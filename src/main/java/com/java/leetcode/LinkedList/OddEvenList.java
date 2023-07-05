package com.java.leetcode.LinkedList;
import java.util.*;
import java.util.List;
/**
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
 *
 * The first node is considered odd, and the second node is even, and so on.
 *
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 *
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 */

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode even = evenHead;

        while(even !=null && even.next != null){
            oddHead.next = evenHead.next;
            oddHead = oddHead.next;
            evenHead.next = oddHead.next;
            evenHead = evenHead.next;
        }
        oddHead.next = even;
        return head;
    }
}

//Check if the head of the input linked list is null, if so, return the head as is.
//
//        Create a pointer called oddHead to point to the head node, which will be the start of the list of odd-positioned nodes.
//
//        Create a pointer called evenHead to point to the second node of the list, which will be the start of the list of even-positioned nodes.
//
//        Create a pointer called even to point to the head of the list of even-positioned nodes.
//
//        While evenHead is not null and evenHead.next is not null:
//
//        Link oddHead.next to evenHead.next, which is the next node of the even-positioned list. This connects the current odd node to the next even node.
//
//        Update oddHead to the next node, which is the next odd-positioned node.
//
//        Link evenHead.next to oddHead.next, which is the next node of the odd-positioned list. This connects the current even node to the next odd node.
//
//        Update evenHead to the next node, which is the next even-positioned node.
