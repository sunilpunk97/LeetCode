package com.java.leetcode.Stack;

import java.util.*;
/*Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.

The span of the stock's price in one day is the maximum number of consecutive days (starting from that day and going backward) for which the stock price was less than or equal to the price of that day.

For example, if the prices of the stock in the last four days is [7,2,1,2] and the price of the stock today is 2, then the span of today is 4 because starting from today, the price of the stock was less than or equal 2 for 4 consecutive days.
Also, if the prices of the stock in the last four days is [7,34,1,2] and the price of the stock today is 8, then the span of today is 3 because starting from today, the price of the stock was less than or equal 8 for 3 consecutive days.
Implement the StockSpanner class:

StockSpanner() Initializes the object of the class.
int next(int price) Returns the span of the stock's price given that today's price is price.*/
public class StockSpanner {
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>(); // Initialize the stack to store price and span pairs
    }

    public int next(int price) {
        int span = 1; // Initialize the span value to 1 for the current price

        // Check if the stack is not empty and the price at the top of the stack is less than or equal to the current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.peek()[1]; // Add the previous span value to the current span
            stack.pop(); // Remove the previous price and span from the stack
        }

        stack.push(new int[]{price, span}); // Push the current price and span to the stack
        return span; // Return the calculated span for the current price
    }
}
