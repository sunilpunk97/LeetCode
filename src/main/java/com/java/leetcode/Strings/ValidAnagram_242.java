package com.java.leetcode.Strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] alpha_counts = new int[26];
        for(int i=0;i<s.length();i++){
            alpha_counts[s.charAt(i) - 'a']++;
            alpha_counts[t.charAt(i) - 'a']--;
        }
        for(int count:alpha_counts){
            if(count != 0)
                return false;
        }
        return true;
    }
}

//    It starts by comparing the lengths of the two input strings s and t. If they have different lengths, it means they cannot be anagrams, so the code returns false.
//
//        It initializes an integer array alpha_counts of size 26 to store the counts of each character. The array represents the occurrence of each character in the strings. Each index corresponds to a character in the English alphabet.
//
//        The code then iterates over each character in the strings s and t using a for loop.
//
//        For each character, it increments the count of that character in the alpha_counts array for the string s (by subtracting 'a' from the character to obtain the corresponding index).
//
//        Simultaneously, it decrements the count of that character in the alpha_counts array for the string t (again by subtracting 'a' from the character to obtain the corresponding index).
//
//        After the loop, if the strings s and t are anagrams, the alpha_counts array should have all elements equal to 0. If any element is non-zero, it means the counts of characters in the two strings are not the same, indicating that they are not anagrams. In that case, the code returns false.
//
//        If the alpha_counts array contains all elements equal to 0, it means the strings s and t are anagrams, so the code returns true.
