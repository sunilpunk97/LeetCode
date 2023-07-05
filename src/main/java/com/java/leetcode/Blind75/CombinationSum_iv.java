package com.java.leetcode.Blind75;
import java.util.*;

public class CombinationSum_iv {
    public int combinationSum4(int[] nums, int target) {
//        Initialize an array dp of size target + 1 to store the number of combinations that can be made for each target value.
//
//        Sort the nums array in ascending order to make sure that we always start with the smallest number.
//
//        Initialize the first element of dp to 1, as there is only one combination when the target value is 0, which is not to choose any number.
//
//        Use a for loop to iterate over the elements of dp. For each iteration, use another for loop to iterate over the elements of nums.
//
//        Check if the current dp[i] is less than the current num. If it is, break the inner loop because we know that adding a larger number will not make the target value, so there is no need to continue checking.
//
//        If dp[i] is greater than or equal to num, add the value of dp[i - num] to dp[i]. This means that if num can be used to make the target value i, the number of combinations that add up to i is the number of combinations that add up to i - num plus the current combination num.
//
//                Return the last element of dp, which represents the number of possible combinations that add up to the target value.
        int[] dp = new int[target + 1];
        dp[0] = 1;
        Arrays.sort(nums);
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i < num) break;
                dp[i] += dp[i - num];
            }
        }
        return dp[target];
    }
}
