package com.java.leetcode.Strings;

import java.util.HashMap;
import java.util.Map;

public class IsmorphicStrings_205 {
    public boolean isIsomorphic(String s, String t) {
        int i=0;
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> charMap = new HashMap<>();
        for(char ch:s.toCharArray()){
            charMap.put(ch,t.charAt(i));
            i++;
        }
        for(char c: charMap.values()){
            sb.append(c);
        }
        if(sb.toString().equals(s))
            return true;
        return false;
    }
}
