package com.java.leetcode.Stack;
import java.util.*;
//You are given an integer array prices where prices[i] is the price of the ith item in a shop.
//
//        There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all.
//
//        Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.
public class FinalPriceWithDiscount {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> myStack = new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!myStack.empty() && prices[myStack.peek()] >= prices[i]){
                prices[myStack.pop()] -= prices[i];
            }
            myStack.push(i);
        }
        return prices;
    }

}
