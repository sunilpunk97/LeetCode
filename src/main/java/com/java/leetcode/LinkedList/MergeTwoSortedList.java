package com.java.leetcode.LinkedList;
import java.util.*;
//You are given the heads of two sorted linked lists list1 and list2.
//
//        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//        Return the head of the merged linked list.
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempnode = new ListNode(0);
        ListNode current_node = tempnode;
        while(list1 !=null && list2 != null){
            if(list1.val < list2.val){
                current_node.next = list1;
                list1 = list1.next;
            }else{
                current_node.next = list2;
                list2 = list2.next;
            }
            current_node = current_node.next;
        }
        if(list1 != null){
            current_node.next = list1;
            list1 = list1.next;
        }
        if(list2 != null){
            current_node.next = list2;
            list2 = list2.next;
        }
        return tempnode.next;
    }

}
//Inputs: Two sorted linked lists, list1 and list2.
//
//        Outputs: A new linked list that contains all the nodes from both input lists, sorted in ascending order based on their val attribute.
//
//        Create a new ListNode called tempnode with val of 0.
//        Create a new ListNode called current_node and set it equal to tempnode.
//        While both list1 and list2 are not null, do the following:
//        Compare the val attribute of the current nodes in list1 and list2.
//        If the val attribute of the current node in list1 is less than the val attribute of the current node in list2, append the current node in list1 to the end of tempnode and advance the list1 pointer to the next node.
//        Otherwise, append the current node in list2 to the end of tempnode and advance the list2 pointer to the next node.
//        Set current_node to point to the last node in tempnode.
//        If list1 is not null, append the remaining nodes in list1 to the end of tempnode.
//        If list2 is not null, append the remaining nodes in list2 to the end of tempnode.
//        Return the next pointer of the first node in tempnode, which skips over the initial dummy node that was created in step 1.
