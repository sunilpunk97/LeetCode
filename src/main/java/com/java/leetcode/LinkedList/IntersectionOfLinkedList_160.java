package com.java.leetcode.LinkedList;
import java.util.*;
public class IntersectionOfLinkedList_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a_pointer = headA;
        ListNode b_pointer = headB;
        while(a_pointer != b_pointer){
            if(a_pointer == null)
                a_pointer = headB;
            else {
                a_pointer = a_pointer.next;
            }
            if(b_pointer == null)
                b_pointer = headA;
            else {
                b_pointer = b_pointer.next;
            }
        }
        return a_pointer;
    }
}

//Algo:
//        Create two pointers a_pointer and b_pointer, initially pointing to the heads of the two input linked lists headA and headB, respectively.
//
//        While the two pointers are not pointing to the same node:
//
//        a. If the a_pointer has reached the end of the linked list headA (i.e., it becomes null), reset it to point to the head of the linked list headB. Otherwise, move a_pointer to its next node.
//
//        b. If the b_pointer has reached the end of the linked list headB (i.e., it becomes null), reset it to point to the head of the linked list headA. Otherwise, move b_pointer to its next node.
//
//        When the two pointers are pointing to the same node, return the node as the intersection point.
