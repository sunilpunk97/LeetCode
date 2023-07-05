package com.java.leetcode.LinkedList;
import java.util.*;

public class AddtwoNumbersPart2_445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(l1 != null){
            stack1.push(l1.val);
            l1 = l1.next; //traverse through list 1 and push each value so that the last element will be on top of the stack
        }
        while (l2 != null){
            stack2.push(l2.val);//traverse through list 2 and push each value so that the last element will be on top of the stack
            l2 = l2.next;
        }
        int carry = 0;
        ListNode result = new ListNode();
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            int a=0, b=0;
            if(!stack1.isEmpty()){
                a = stack1.pop();
            }
            if(!stack2.isEmpty())
                b = stack2.pop();
            int total = a+b+carry;
            ListNode tempResult = new ListNode(total%10);
            carry = total/10;
            if(result == null)
                result = tempResult;
            else {
                tempResult.next = result;
                result = tempResult;
            }
        }
        if(carry != 0){
            ListNode temp = new ListNode(carry);
            temp.next = result;
            result = temp;
        }
        return result;
    }
}

//Algo:
//        Create two empty stacks called stack1 and stack2.
//
//        Traverse the first linked list l1 and push each node's value onto the stack1 stack.
//
//        Traverse the second linked list l2 and push each node's value onto the stack2 stack.
//
//        Create an empty linked list result to store the sum of the two linked lists.
//
//        Initialize a variable called carry to 0.
//
//        While either stack1 or stack2 is not empty, pop values from stack1 and stack2, and add them together along with carry.
//
//        Create a new linked list node for the resulting sum mod 10.
//
//        Set the value of carry to the resulting sum divided by 10.
//
//        If result is null, set it to the new node. Otherwise, add the new node to the beginning of result.
//
//        If carry is not zero after the loop, create a new node with the value of carry and add it to the beginning of result.
//
//        Return result, which is the sum of the two linked lists.


