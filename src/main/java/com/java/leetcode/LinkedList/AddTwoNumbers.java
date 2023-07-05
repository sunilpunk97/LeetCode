package com.java.leetcode.LinkedList;
import java.util.*;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//        Example 1:
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.
//        Example 2:
//
//        Input: l1 = [0], l2 = [0]
//        Output: [0]
//        Example 3:
//
//        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        Output: [8,9,9,9,0,0,0,1]
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int v1=0,v2=0,sum=0,carry=0;
        ListNode sumHead = new ListNode(-1);
        ListNode ptr = sumHead;
        while(l1 != null || l2!= null){
            if(l1 != null){
                v1 = l1.val;
                l1 = l1.next;
            }else v1=0;
            if(l2 != null){
                v2 = l2.val;
                l2 = l2.next;
            }else v2=0;
            sum = v1+v2+carry;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            ptr.next = temp;
            ptr = ptr.next;
        }
        if(carry != 0){
            ListNode temp = new ListNode(carry);
            ptr.next = temp;

        }
        return sumHead.next;
    }
}

//    Initialize variables v1, v2, sum, and carry to 0. Also, create a new linked list called sumHead with an initial value of -1 and a pointer ptr that points to the head of sumHead.
//
//        Traverse both input linked lists l1 and l2 simultaneously until both of them reach their end (i.e., null).
//
//        For each iteration, extract the values v1 and v2 from the corresponding nodes of l1 and l2, respectively. If either list has reached its end, set the value to 0 instead.
//
//        Compute the sum of v1, v2, and carry. If the sum is greater than or equal to 10, then set carry to 1 and set the value of sum to sum % 10.
//
//        Create a new node temp with the value of sum, and add it to the end of the sumHead list using the ptr pointer.
//
//        Move the ptr pointer to the next node in the sumHead list.
//
//        After iterating through the input lists, if carry is still not equal to 0, create a new node with value carry and add it to the end of the sumHead list.
//
//        Return the next node of the sumHead list, which represents the head of the linked list that contains the sum of the input lists.
