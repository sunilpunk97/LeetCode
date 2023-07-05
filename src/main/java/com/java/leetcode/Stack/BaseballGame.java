package com.java.leetcode.Stack;
import java.util.*;
//You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
//
//        An integer x.
//        Record a new score of x.
//        '+'.
//        Record a new score that is the sum of the previous two scores.
//        'D'.
//        Record a new score that is the double of the previous score.
//        'C'.
//        Invalidate the previous score, removing it from the record.
//        Return the sum of all the scores on the record after applying all the operations.

public class BaseballGame {
    public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (String str : operations) {
            if (str.equals("C")) {
                sum = sum - stack.pop();
            } else if (str.equals("D")) {
                sum += 2 * stack.peek();
                stack.push(2 * stack.peek());

            } else if (str.equals("+")) {
                int temp = stack.pop();
                int newval = stack.peek() + temp;
                stack.push(temp);
                stack.push(newval);
                sum += newval;
            } else {
                int val = Integer.parseInt(str);
                stack.push(val);
                sum += val;
            }
        }
        return sum;
    }
}

//    Initialize the sum variable to 0 and create an empty stack stack of integers.
//
//        Iterate through each element of the input string array operations.
//
//        If the current element is "C", remove the previous score from the stack and subtract it from the sum.
//
//        If the current element is "D", double the previous score, push it onto the stack, add it to the sum.
//
//        If the current element is "+", take the top two elements from the stack, compute their sum and push it onto the stack, add it to the sum.
//
//        If the current element is an integer, parse it and push it onto the stack, add it to the sum.
//
//        Continue iterating until all the elements in the operations array have been processed.
//
//        Return the final sum.
