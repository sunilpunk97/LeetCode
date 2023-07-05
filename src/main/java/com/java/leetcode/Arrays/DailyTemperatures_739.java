package com.java.leetcode.Arrays;

import java.util.Stack;

//Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
//
//
//
//        Example 1:
//
//        Input: temperatures = [73,74,75,71,69,72,76,73]
//        Output: [1,1,4,2,1,1,0,0]
//        Example 2:
//
//        Input: temperatures = [30,40,50,60]
//        Output: [1,1,1,0]

public class DailyTemperatures_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){//we traverse through the array.
            while (!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){//we check whether the value about to be pushed is less than the value of the temp at the index of stacks top element temp[stack.peek()].
                result[stack.peek()] = i-stack.peek(); //we store the value at the stack.peek() index of our resut array.
                stack.pop();
            }
            stack.push(i);//We push the index of the first elem anyway.
        }
        return result;
    }
}

//Algo:
//        Initialize a stack to store the indices of temperatures whose next warmer temperature is yet to be determined.
//        Initialize an integer array result of the same size as the input array to store the number of days until a warmer temperature is observed.
//        Traverse through the input array using a loop from the beginning to the end.
//        For each temperature, check if the stack is not empty and the temperature at the top of the stack is less than the current temperature.
//        If the above condition is true, then update the corresponding value in the result array with the difference between the current index and the index at the top of the stack. This represents the number of days until a warmer temperature is observed for the temperature at the top of the stack.
//        Pop the index at the top of the stack since its next warmer temperature has been determined.
//        Push the current index onto the stack.
//        After the loop is completed, return the result array.
