package com.java.leetcode.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue_225 {
    Queue<Integer> queue = new LinkedList<>();
    public void MyStack() {

    }

    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        for(int i=0;i<size-1;i++){
            int first_el = queue.remove();
            queue.add(first_el);
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
    return queue.isEmpty();
    }
}
