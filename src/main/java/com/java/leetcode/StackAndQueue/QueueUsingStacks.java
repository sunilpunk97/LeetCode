package com.java.leetcode.StackAndQueue;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1, stack2;
    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (stack1.size()>1){
            stack2.push(stack1.pop());
        }
        int data = stack1.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return data;
    }

    public int peek() {
        while (stack1.size()>1){
            stack2.push(stack1.pop());
        }
        int data = stack1.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return data;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}
