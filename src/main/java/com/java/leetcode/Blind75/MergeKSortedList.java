package com.java.leetcode.Blind75;

//You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//
//        Merge all the linked-lists into one sorted linked-list and return it.
//        Example 1:
//
//        Input: lists = [[1,4,5],[1,3,4],[2,6]]
//        Output: [1,1,2,3,4,4,5,6]
//        Explanation: The linked-lists are:
//        [
//        1->4->5,
//        1->3->4,
//        2->6
//        ]
//        merging them into one sorted list:
//        1->1->2->3->4->4->5->6
import java.util.*;

public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode headOfSubLists: lists){
            while (headOfSubLists != null){
                minHeap.add(headOfSubLists.val);
                headOfSubLists = headOfSubLists.next;
            }
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode head = dummyHead;
        while (!minHeap.isEmpty()){
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }
        return dummyHead.next;
    }
}

//    Initialize a priority queue (min heap) to store the elements of all the lists in a sorted order.
//        Iterate over the input array of linked lists:
//        a. For each linked list, iterate through all the nodes in the list and add the node values to the min heap.
//        Initialize a dummy head node and a current node to keep track of the merged linked list.
//        While the min heap is not empty:
//        a. Remove the minimum element from the min heap and create a new node with that value.
//        b. Set the next pointer of the current node to point to the new node and move the current node to the new node.
//        Return the next node of the dummy head as the merged linked list.
