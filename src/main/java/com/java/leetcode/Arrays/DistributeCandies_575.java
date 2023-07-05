package com.java.leetcode.Arrays;

import java.util.HashSet;
import java.util.Set;
//Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.
//
//        The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.
//
//        Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
public class DistributeCandies_575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> mySet = new HashSet<>();
        for(int i:candyType){
            mySet.add(i);
        }
        return Math.min(candyType.length/2, mySet.size());
    }
}

//Algo:
//        Create a new HashSet called mySet.
//        Iterate through each element i in the input array candyType:
//        a. Add i to the mySet using mySet.add(i).
//        Calculate the maximum number of unique candies that can be distributed:
//        a. Divide the length of the candyType array by 2 to get half of the total number of candies.
//        b. Take the minimum value between the size of the mySet and half of the total number of candies calculated in step 3a.
//        Return the maximum number of unique candies calculated in step 3b.
