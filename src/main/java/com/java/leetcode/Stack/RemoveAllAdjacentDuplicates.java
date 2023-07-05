//You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
//
//        We repeatedly make duplicate removals on s until we no longer can.
//
//        Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
//
//
//
//        Example 1:
//
//        Input: s = "abbaca"
//        Output: "ca"
//        Explanation:
//        For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

package com.java.leetcode.Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    String s = "Hello";
    public String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int i=0;

        for(int j=0;j<s.length();j++){
            char curr = s.charAt(j);
            if(i>0 && stack[i-1]==curr){
                i--;
            }else{
                stack[i] = curr;
                i +=1;
            }
        }
        return new String(stack, 0 , i);
    }

}

//    Create an empty character stack and initialize an integer variable i to 0.
//        Loop through each character in the input string s using a for loop, with index variable j.
//        For each character, check if it's the same as the character on top of the stack (which is the last character that was added to the stack).
//        If it is, remove the character on top of the stack (i.e., decrement i), since it's a duplicate.
//        If it's not the same, add the character to the stack (i.e., push it onto the stack) and increment i.
//        After looping through all the characters in s, create a new string using the characters in the stack, starting from index 0 and ending at index i.
//        Return the new string with duplicates removed.
