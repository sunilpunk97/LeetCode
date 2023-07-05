package com.java.leetcode.GeneralDSA;

public class DayOftheWeek_1185 {
    public String dayOfTheWeek(int day, int month, int year){
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] days = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //for feb month we are checking whether its leap yr or not.
        int count = 0;

        for(int i=1971;i<year;i++){
            count += i%4 == 0?366 : 365; //For all the years before our prev years starting from 1971 we care adding the total num of days for each year.
        }
        for(int i=0;i<month-1;i++){//for our given year for all the 12 months we are addind days of each of the months.
            count += days[i];
        }
        return week[(count)+4 %7];// finally returning the day from the array declared using this formula.
    }
    public boolean isLeapYear(int year){
        return (year % 4 ==0 && year % 100 != 0 || year % 400 == 0);
    }
}
