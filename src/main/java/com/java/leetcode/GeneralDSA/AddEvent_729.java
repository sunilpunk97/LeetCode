package com.java.leetcode.GeneralDSA;

import java.util.TreeMap;

public class AddEvent_729 {
    TreeMap<Integer,Integer> calendar;
    public  void MyCalendar() {
        calendar = new TreeMap<>();
    }                                                       //Usually the map will be null,null.so the first entries will be pushed (10,20) for example.
    public boolean book(int start, int end) {
        Integer startfloor = calendar.floorKey(start);  //Checks whether there is any lesser key value.
        Integer startceil = calendar.ceilingKey(start); //Checks whether there is any greater key value
        if((startfloor == null || calendar.get(startfloor)<=start) && (startceil==null || end<=startceil) )//if the start date of the second entry is less than the
        {                                                                                       //end date of the existing event then false.
                                                                    //if there is an event inbetween (10,20) and (30,40) ..like (25,30)
            calendar.put(start,end);
            return true;
        }
        return false;
    }
}
//    Find the largest start time that is less than or equal to the start time of the new event, using floorKey. Let this value be startfloor.
//        Find the smallest start time that is greater than or equal to the start time of the new event, using ceilingKey. Let this value be startceil.
//        If there is no conflicting event, i.e., either startfloor is null or the end time of the event at startfloor is less than or equal to the start time of the new event, and either startceil is null or the end time of the new event is less than or equal to the start time of the event at startceil, then add the new event to the calendar and return true.
//        Otherwise, return false.