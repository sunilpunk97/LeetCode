package com.java.leetcode.Arrays;
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
public class BestTimetoBuyandSellStock_121 {

    public int maxProfit(int[] prices) {
        int min =Integer.MAX_VALUE;
        int max_profit =0;
        for(int item:prices){
            if(item<min)
                min = item;
            else if (item-min>max_profit) {
                max_profit = item-min;
            }
        }
        return max_profit;
    }

}
//    Initialize min to the first element in the prices array.
//
//        Initialize max_profit to 0.
//
//        Loop through each element item in the prices array:
//
//        a. Update min to be the minimum of min and item.
//
//        b. Update max_profit to be the maximum of max_profit and item - min.
//
//        Once the loop has completed, return max_profit.
