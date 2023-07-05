package com.java.leetcode.LinkedList;
import java.util.*;

public class RemoveElements {
    public ListNode removeElements(ListNode head, int val){
        while (head !=null && head.val == val){
            head = head.next;
        }

        ListNode curr = head;
        while(curr!=null && curr.next != null){
            if(curr.next.val==val){
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return head;
    }
}

//Algo:
//        Iterate through the linked list starting from the head, and check if the head node has the same value as val.
//        If the head node's value is equal to val, set the head to the next node in the list. This is done by setting head = head.next.
//        After removing all nodes with the target value from the beginning of the list, set a new current pointer curr to the head of the list.
//        Iterate through the linked list using the current pointer curr.
//        For each node, check if the next node's value is equal to val.
//        If it is, remove the next node from the list by setting curr.next = curr.next.next.
//        If it isn't, advance the current pointer to the next node in the list by setting curr = curr.next.
//        After completing the loop, return the modified linked list.
