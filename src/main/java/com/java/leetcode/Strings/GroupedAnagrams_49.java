package com.java.leetcode.Strings;
import java.util.*;
public class GroupedAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
//        Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//                Example 1:
//
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//        Example 2:
//
//        Input: strs = [""]
//        Output: [[""]]
        int len = strs.length;
        List<List<String>> groupedAnagrams = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String current: strs){
            char[] characters = current.toCharArray(); //idea is sort every string given in the list
            Arrays.sort(characters);//first converting every string to array and then sorting it and again converting to string
            String sorted = new String(characters);
            if(!map.containsKey(sorted))//We then check whether tyhe sorted string is present in the map..if yes we just put it as key and group the value of the string in the list
                map.put(sorted, new ArrayList<>());
            map.get(sorted).add(current);
        }
        groupedAnagrams.addAll(map.values());//finally in our list of lists , we add all the values of the corresponding sorted
        return groupedAnagrams;
    }
}
