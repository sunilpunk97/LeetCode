package com.java.leetcode.DynamicProgramming;

public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<= n; i++){ //starting from the second steps the no of ways to reach a particular steps is to calculate the no of ways present to reach the two previous steps
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
