package com.java.leetcode.Strings;
import java.util.*;
/*
* Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"*/

public class DecodeString_394 {
    public String decodeString(String s) {
        // Create a stack to hold characters
        Stack<Character> holderStack = new Stack<>();

        // Iterate through each character in the input string
        for (char ch : s.toCharArray()) {
            if (ch != ']') {
                // If the character is not ']', push it to the stack
                holderStack.push(ch);
            } else {
                // If the character is ']', it indicates the end of a substring to be decoded

                // Create a StringBuilder to hold the characters of the substring
                StringBuilder sb = new StringBuilder();

                // Pop characters from the stack until a non-letter character is encountered
                while (!holderStack.isEmpty() && Character.isLetter(holderStack.peek())) {
                    sb.insert(0, holderStack.pop());
                }

                // Get the decoded substring
                String sub = sb.toString();

                // Pop the '[' character from the stack
                holderStack.pop();

                // Create a new StringBuilder to hold the count of repetitions
                sb = new StringBuilder();

                // Pop characters from the stack until a non-digit character is encountered
                while (!holderStack.isEmpty() && Character.isDigit(holderStack.peek())) {
                    sb.insert(0, holderStack.pop());
                }

                // Convert the count of repetitions to an integer
                int count = Integer.valueOf(sb.toString());

                // Repeat the decoded substring 'count' number of times
                while (count > 0) {
                    for (char subCh : sub.toCharArray()) {
                        holderStack.push(subCh);
                    }
                    count--;
                }
            }
        }

        // Create a StringBuilder to hold the final decoded string
        StringBuilder res = new StringBuilder();

        // Pop characters from the stack until a non-letter character is encountered
        while (!holderStack.isEmpty() && Character.isLetter(holderStack.peek())) {
            res.insert(0, holderStack.pop());
        }

        // Return the decoded string
        return res.toString();
    }

}


