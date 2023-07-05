package com.java.leetcode.LinkedList;

public class RemoveDuplicatesFromSortedList_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null){
            if(curr.val == curr.next.val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }
}

//    Start with a pointer called curr that initially points to the head of the input linked list.
//
//        While curr is not null and curr.next is not null, compare the value of curr with the value of curr.next.
//
//        If curr and curr.next have the same value, that means there is a duplicate element in the linked list. In that case, skip curr.next by setting curr.next to curr.next.next, effectively removing the duplicate element from the linked list.
//
//        If curr and curr.next have different values, that means curr is not a duplicate element. In that case, move curr to the next node in the linked list by setting curr to curr.next.
//
//        Repeat steps 2-4 until curr is null or curr.next is null, indicating that we have reached the end of the linked list.
//
//        Return the head of the modified linked list.
