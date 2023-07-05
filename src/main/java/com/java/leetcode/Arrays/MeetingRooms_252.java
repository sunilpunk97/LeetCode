package com.java.leetcode.Arrays;

import java.util.Arrays;

public class MeetingRooms_252 {
    public boolean isMeetingPossible(Interval[] intervals){
        int[] startDates = new int[intervals.length];//Intervals format[[start,end],[start,end]...]
        int[] endDates = new int[intervals.length];
        for(int i=0;i< intervals.length;i++){//Declaring two different arrays one only holds the start dates from the intervals array
            startDates[i] = intervals[i].start;
            endDates[i] = intervals[i].end;//Latter stores the end dates from the intervals array.
        }
        Arrays.sort(startDates);//Both the arrays are first sorted for checking
        Arrays.sort(endDates);
        for(int i=0;i<intervals.length-1;i++){//the check is in order for successful meeting the next meeting's start date should be less than the end date of the previous meeting.
            if(startDates[i+1] < endDates[i]){//if suppose it fails we return false.
                return false;
            }
        }
        return true;//else finally after array is traversed true is returned.
    }
}
