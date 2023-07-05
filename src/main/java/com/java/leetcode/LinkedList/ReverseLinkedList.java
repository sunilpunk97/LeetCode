package com.java.leetcode.LinkedList;
import java.util.*;

public class ReverseLinkedList {
    public ListNode revLinkedList(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }
}

//Algorithm:
//
//// The input to the function is the head of the original linked list.
//// The algorithm initializes a new variable prev to null, which will be used to store the new head of the reversed list.
//// The algorithm enters a while loop that continues as long as there are still nodes in the original linked list to process.
////Inside the loop, the algorithm saves the next node in the original list to a new variable next_node.
//// The algorithm then sets the next pointer of the current node (which is head) to prev, effectively reversing the direction of the link between the current node and the previous node.
//// The algorithm updates prev to point to the current node, since this node is now the "previous" node in the reversed list.
//// Finally, the algorithm updates head to point to the next_node, which is the next node in the original list that needs to be processed.
//// Once the loop completes, the algorithm returns prev, which is the new head of the reversed list.
