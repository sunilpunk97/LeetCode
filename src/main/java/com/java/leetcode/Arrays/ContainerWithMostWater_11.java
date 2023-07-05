package com.java.leetcode.Arrays;

public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        //We use 2 pointer technique
        //Assign left and right ptrs to the first and last position
        //We then move inwards calculating max area of each boundary
        //we calculate max area by calculating the smaller height and multiplying it with the boundary length(right-left)
        //we keep on updating the max area in each loop with math.max
        //If height[left] is higher we increment left
        //if height[right] is higher than left we decrement right.
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, (right - left) * h);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
