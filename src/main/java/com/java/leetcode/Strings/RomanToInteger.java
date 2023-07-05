package com.java.leetcode.Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        myMap.put('I', 1);
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C', 100);
        myMap.put('D', 500);
        myMap.put('M', 1000);
        int result = 0;

        for(int i=0;i<s.length();i++){
            if(i>0 && myMap.get(s.charAt(i)) > myMap.get(s.charAt(i-1)))
                result += myMap.get(s.charAt(i)) - 2*myMap.get(s.charAt(i-1));
            else {
                result += myMap.get(s.charAt(i));
            }
        }
        return result;
    }
}

//    It starts by creating a HashMap called myMap to store the mapping of each Roman numeral character to its corresponding integer value.
//
//        It adds the mappings for Roman numeral characters 'I', 'V', 'X', 'L', 'C', 'D', and 'M' along with their respective integer values.
//
//        It initializes an int variable called result to store the final converted integer value.
//
//        The code then iterates over each character in the string s using a for loop.
//
//        For each character, it checks if the current character is greater than the previous character. This condition indicates the presence of a subtractive combination such as 'IV' (4) or 'IX' (9).
//
//        If the current character is greater than the previous character, it subtracts twice the value of the previous character from the current character's value. This subtraction accounts for the subtractive combination.
//
//        Otherwise, if the current character is not greater than the previous character, it simply adds the value of the current character to the result.
//
//        After iterating over all characters in the string, the result variable will contain the converted integer value.
//
//        Finally, it returns the result integer value.
