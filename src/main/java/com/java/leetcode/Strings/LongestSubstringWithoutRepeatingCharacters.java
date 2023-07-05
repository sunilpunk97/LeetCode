package com.java.leetcode.Strings;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int first_ptr =0;
        int sec_ptr = 0;
        int maximum = 0;
        HashSet<Character> hash_set = new HashSet<>();
        while(sec_ptr < s.length()){
            if(!hash_set.contains(s.charAt(sec_ptr))){
                hash_set.add(s.charAt(sec_ptr));
                sec_ptr++;
                maximum = Math.max(maximum, hash_set.size());
            }else {
                hash_set.remove(s.charAt(first_ptr));
                first_ptr++;
            }
        }
        return maximum;
    }
}
//
//    It initializes three variables: first_ptr and sec_ptr to keep track of the start and end indices of the current substring, and maximum to store the length of the longest substring found so far. It also creates a HashSet named hash_set to store the unique characters in the current substring.
//
//        The code enters a while loop that continues until sec_ptr reaches the end of the string s.
//
//        Within the loop, it checks if the character at sec_ptr is not already present in the hash_set. If it's not present, it means the character is unique in the current substring.
//
//        In that case, it adds the character to the hash_set, increments sec_ptr to move to the next character, and updates the maximum length by comparing it with the size of the hash_set.
//
//        If the character at sec_ptr is already present in the hash_set, it means there is a repeating character in the current substring.
//
//        In this case, it removes the character at first_ptr from the hash_set, increments first_ptr to move the start of the substring forward, and continues to check for the next character.

////        The loop continues until sec_ptr reaches the end of the string, and the maximum length keeps getting updated with the length of the longest substring found so far.
//
//        Finally, it returns the maximum length, which represents the length of the longest substring without any repeating characters in the given string s.
