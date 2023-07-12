package com.java.leetcode.Arrays;

public class FindTheHighestAltitude_1732 {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int heights:gain){
            sum += heights;
            max = Math.max(sum,max);

        }
        if(max < 0)
            return 0;
        return max;
    }
}
/*
* It initializes two variables: sum to keep track of the current cumulative altitude gain and max to store the maximum altitude reached.
It iterates over each element heights in the gain array.
Inside the loop, it adds the current heights value to the sum variable to calculate the cumulative altitude gain.
It then compares the current sum value with the current max value using the Math.max method. If the sum is greater than the max, it updates the max value.
After the loop, it checks if the max value is negative. If it is, it means no positive altitude was reached, so it returns 0.
If the max value is non-negative, it returns the maximum altitude reached.*/
