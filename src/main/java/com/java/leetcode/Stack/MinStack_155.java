package com.java.leetcode.Stack;

import java.util.Stack;

public class MinStack_155 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> min_stack = new Stack<>();
    public void MinStack() {

    }

    public void push(int val) {
        if(min_stack.isEmpty() || val<=min_stack.peek())
            min_stack.push(val);
        stack1.push(val);
    }

    public void pop() {
        if(stack1.peek().equals(min_stack.peek()))
            min_stack.pop();
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}
//    Declare two Stack objects, "stack1" and "min_stack", to store the elements and minimums respectively.
//        The constructor method does not take any parameters and does not perform any actions.
//        The "push" method takes an integer value as input and adds it to "stack1". It also updates
//            the "min_stack" by pushing the new value only if the new value is less than or equal to the current minimum element. This ensures that "min_stack" always contains the minimum element in the stack at any given time.
//        The "pop" method removes the top element from "stack1". If the removed element was also the current minimum element, it removes that element from "min_stack" as well, since it is no longer in the stack.
//        The "top" method returns the top element of "stack1", without modifying the stack.
//        The "getMin" method returns the current minimum element of the stack, which is stored at the top of "min_stack". Since "min_stack" always contains the minimum element at any given time, we can retrieve the minimum element in constant time by simply returning the top element of "min_stack".
