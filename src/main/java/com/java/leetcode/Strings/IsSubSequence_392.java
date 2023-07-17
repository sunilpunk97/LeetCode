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
    public boolean isSubsequence(String s, String t) {
        // If the subsequence string s is empty, it is considered a subsequence of any string
        if (s.length() == 0) {
            return true;
        }

        // Initialize a pointer for the subsequence string s
        int sPointer = 0;

        // Iterate through the target string t
        for (int i = 0; i < t.length(); i++) {
            // If the current character in t matches the character in s at the current pointer position, move the pointer forward
            if (t.charAt(i) == s.charAt(sPointer)) {
                sPointer++;
            }

            // If the pointer reaches the end of the subsequence string s, it means that all characters in s have been found in t in the same order
            if (sPointer == s.length()) {
                return true;
            }
        }

        // If the loop finishes without finding all characters in the subsequence string s, return false
        return false;
    }

}
