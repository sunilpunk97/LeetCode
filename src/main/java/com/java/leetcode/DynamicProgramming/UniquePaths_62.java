package com.java.leetcode.DynamicProgramming;

public class UniquePaths_62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {   //start from marking the first row values, all to 1.
            dp[i][0] = 1;
        }
        for (int i = 0; i < dp[0].length; i++) {   //Then we mark the first column to 1;
            dp[0][i] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {   //Then for the all the unmarked cells we are calculating , the number of ways we can reach to that unmarked cells.
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];// finally we are returning the number of ways to reach the last most target cell.
    }
}
