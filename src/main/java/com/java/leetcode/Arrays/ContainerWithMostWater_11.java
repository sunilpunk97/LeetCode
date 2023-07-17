package com.java.leetcode.Arrays;

public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        // Initialize two pointers, left and right, representing the left and right boundaries of the container
        int left = 0;
        int right = height.length - 1;

        // Initialize a variable to store the maximum area encountered
        int maxArea = 0;

        // Continue the loop while the left pointer is less than the right pointer
        while (left < right) {
            // Calculate the height of the container as the minimum height between the left and right boundaries
            int h = Math.min(height[left], height[right]);

            // Calculate the area of the container as the width (right - left) multiplied by the height (h)
            int area = (right - left) * h;

            // Update the maximum area if the current area is greater
            maxArea = Math.max(maxArea, area);

            // Move the pointer that corresponds to the smaller height inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // Return the maximum area encountered
        return maxArea;
    }

}
