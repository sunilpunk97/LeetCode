package com.java.leetcode.Arrays;

//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
//
//
//
//        Example 1:
//
//        Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//        Output: [[1,6],[8,10],[15,18]]
//        Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
//        Example 2:
//
//        Input: intervals = [[1,4],[4,5]]
//        Output: [[1,5]]
//        Explanation: Intervals [1,4] and [4,5] are considered overlapping.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0], arr2[0])); //we are srranging the set of intervals in ascending order based on the value of 1st elements of each intervals.
        List<int[]> outputList = new ArrayList<>();
        int[] current_interval = intervals[0]; //basically we create an array and store the first array of the intervals in it.
        outputList.add(current_interval); // we initially add this current_interval to our output list of arrays.
        for(int[] interval: intervals){ //we loop through all the individual interval of the interval group of arrays
            int current_begin = current_interval[0]; //this stores the second value of the current-interval(here [1,3] means it stores 3)
            int current_end = current_interval[1]; //this stores the second element ie end value of the current - interval
            int next_begin = interval[0]; //like wise it store the values (first and second values) of the existing set that is been traversed)->
            int next_end = interval[1];

            if(current_end >= next_begin){ //if the start of the next interval is than the end of the prev interval then we update the end element with the greatest end.
                current_interval[1] = Math.max(current_end,next_end);//then we continue the loop with next interval array
            }else {
                current_interval = interval; //if there is no collision then we just add the interval array to out list and loop to the next one.
                outputList.add(current_interval);
            }
        }
        return outputList.toArray(new int[outputList.size()][]);
    }
}
