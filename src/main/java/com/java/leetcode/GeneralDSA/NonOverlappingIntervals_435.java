package com.java.leetcode.GeneralDSA;
import java.util.*;

public class NonOverlappingIntervals_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // Sort the intervals based on the start time using the lambda expression for custom comparison

        int res = 0; // Initialize the count of overlapping intervals to 0
        int prevEnd = intervals[0][1]; // Set the previous end time to the end time of the first interval

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0]; // Get the start time of the current interval
            int end = intervals[i][1]; // Get the end time of the current interval

            if (start >= prevEnd) {
                // If the start time of the current interval is greater than or equal to the previous end time,
                // it means the intervals do not overlap
                prevEnd = end; // Update the previous end time to the end time of the current interval
            } else {
                // If the start time of the current interval is less than the previous end time,
                // it means the intervals overlap
                res++; // Increment the count of overlapping intervals
                prevEnd = Math.min(end, prevEnd);
                // Update the previous end time to the minimum of the end time of the current interval and the previous end time
                // This ensures that subsequent intervals are compared correctly for overlapping
            }
        }

        return res; // Return the count of overlapping intervals
    }

}
