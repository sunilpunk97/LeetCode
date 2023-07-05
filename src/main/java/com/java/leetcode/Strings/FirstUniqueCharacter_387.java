package com.java.leetcode.Strings;

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//        Example 1:
//
//        Input: s = "leetcode"
//        Output: 0
//        Example 2:
//
//        Input: s = "loveleetcode"
//        Output: 2
//        Example 3:
//
//        Input: s = "aabb"
//        Output: -1

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter_387 {
    //iterate through all the elements of string s
    //check if the char is already in map.
    //if its not in the map put the char along with its index as its value(if l is in position 2 then put(l,2)
    //if the key ie the char is already in map then just update in value but map.put(key,-1)
    //loop through the key set
    //if there is a key with value greater than -1 then its a candidate whose value we have to return(here value is its index)
    public int firstUniqChar(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!myMap.containsKey(s.charAt(i)))
                myMap.put(s.charAt(i), i);
            else {
                myMap.put(s.charAt(i), -1);
            }
        }
        int min = Integer.MAX_VALUE;
        for(char c: myMap.keySet()){
            if(myMap.get(c) > -1 && myMap.get(c)< min)
                min = myMap.get(c);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}

//    Create a HashMap called 'myMap' to store characters as keys and their corresponding indices as values.
//
//        Iterate through each character of the string 's' using a for loop.
//
//        For each character at index 'i', check if it is already present in the 'myMap' using the 'containsKey' method. If it is not present, add the character as a key and its index 'i' as the value in the 'myMap'. This indicates that this character is the first occurrence.
//
//        If the character is already present in the 'myMap', update its value to -1. This indicates that this character is not unique.
//
//        After processing all the characters in the string 's', initialize a variable 'min' with the maximum possible integer value (Integer.MAX_VALUE). This variable will store the index of the first unique character.
//
//        Iterate through each character 'c' in the key set of 'myMap'.
//
//        Check if the value corresponding to the character 'c' in 'myMap' is greater than -1 (indicating a unique character) and less than the current minimum 'min'. If true, update 'min' with the value from 'myMap'.
//
//        After iterating through all the characters in 'myMap', check if 'min' is still equal to Integer.MAX_VALUE. If it is, no unique character was found, so return -1.
//
//        Otherwise, return the value of 'min', which represents the index of the first unique character in the string 's'.
