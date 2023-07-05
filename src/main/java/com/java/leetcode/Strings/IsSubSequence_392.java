package com.java.leetcode.Strings;
//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//        A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//
//        Example 1:
//
//        Input: s = "abc", t = "ahbgdc"
//        Output: true
//        Example 2:
//
//        Input: s = "axc", t = "ahbgdc"
//        Output: false

public class IsSubSequence_392 {
    //basic check if s is nothing then its always true.
    //we traverse through all the char of string t one by one
    //for each char we check whether that character is equal to the first char of string s.
    //if it matches then we increment the s_pointer so that now we have to check whether the secong char of s is present.
    //when the spointer equals the length of the string s then we return true, meaning all the string are present and also in the same order.
    //order of s should be maintained in t.
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;
        int s_pointer = 0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == s.charAt(s_pointer))
                s_pointer++;
            if(s_pointer == s.length()){
                return true;
            }
        }
        return false;
    }
}
