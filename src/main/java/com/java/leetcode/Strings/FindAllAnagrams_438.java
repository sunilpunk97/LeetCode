package com.java.leetcode.Strings;
import java.util.*;

//Input: s = "cbaebabacd", p = "abc"
//        Output: [0,6]
//        Explanation:
//        The substring with start index = 0 is "cba", which is an anagram of "abc".
//        The substring with start index = 6 is "bac", which is an anagram of "abc".

public class FindAllAnagrams_438 { //REVISIT
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s.length()==0 || s==null) return result;
        int[] char_count = new int[26];
        for(char c: p.toCharArray()){
            char_count[c-'a']++;
        }
        int left = 0;
        int right = 0;
        int count = p.length();
        while(right < s.length()){
            if(char_count[s.charAt(right++)-'a']-->= 1)
                count--;
            if(count == 0)
                result.add(left);
            if(right - left == p.length() && char_count[s.charAt(left++)-'a']++ >= 0)
                count++;
        }
        return result;
    }
}
