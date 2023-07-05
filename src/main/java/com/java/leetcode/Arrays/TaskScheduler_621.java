package com.java.leetcode.Arrays;
//Given a characters array tasks, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.
//
//        However, there is a non-negative integer n that represents the cooldown period between two same tasks (the same letter in the array), that is that there must be at least n units of time between any two same tasks.
//
//        Return the least number of units of times that the CPU will take to finish all the given tasks.
//
//
//
//        Example 1:
//
//        Input: tasks = ["A","A","A","B","B","B"], n = 2
//        Output: 8
//        Explanation:
//        A -> B -> idle -> A -> B -> idle -> A -> B
//        There is at least 2 units of time between any two same tasks.

import java.util.Arrays;

public class TaskScheduler_621 {
    public int leastInterval(char[] tasks, int n) {
        char[] charMap = new char[26];
        for(char ch: tasks){
            charMap[ch - 'A']++; //for each character in tasks array we are subtracting 'A' from each character to update the counts of each character and store in the created array.
        }
        Arrays.sort(charMap); //sort the array.
        int maxval = charMap[25] - 1;
        int idle_slots = maxval * n;
        for(int i=24;i>=0;i--){
            idle_slots -= Math.min(charMap[i],maxval); ///we start from second last element in charmap and move to front and update idle slots in each loop
        }
        return idle_slots > 0? idle_slots+tasks.length : tasks.length;
    }
}
