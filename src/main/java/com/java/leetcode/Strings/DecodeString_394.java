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
        Stack<Character> holderStack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch !=']')
                holderStack.push(ch);
            else{
                StringBuilder sb = new StringBuilder();
                while(!holderStack.isEmpty() && Character.isLetter(holderStack.peek()))
                    sb.insert(0,holderStack.pop());
                String sub = sb.toString();
                holderStack.pop();
                sb = new StringBuilder();
                while(!holderStack.isEmpty() && Character.isDigit(holderStack.peek()))
                    sb.insert(0,holderStack.pop());
                int count = Integer.valueOf(sb.toString());
                while(count>0){
                    for(char subCh:sub.toCharArray())
                        holderStack.push(subCh);
                    count--;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(!holderStack.isEmpty() && Character.isLetter(holderStack.peek()))
            res.insert(0,holderStack.pop());
        return res.toString();
    }
}

/*
It initializes a stack named stack to store characters during the decoding process.
The code iterates over each character c in the input string s.
If c is not ']', it means it is part of the original string, so it is pushed onto the stack.
If c is ']', it means we need to decode a substring. The code does the following steps:
a. It creates a new StringBuilder named sb to store the substring.
b. While the stack is not empty and the top character is a letter, it pops characters from the stack and inserts them at the beginning of sb.
c. The resulting substring is stored in the variable sub.
d. The code pops the '[' character from the stack since it marks the beginning of the substring.
e. It creates another StringBuilder named sb to store the count of repetitions.
f. While the stack is not empty and the top character is a digit, it pops characters from the stack and inserts them at the beginning of sb.
g. The resulting string is converted to an integer using Integer.valueOf and stored in the variable count.
h. It performs the repetition of the substring by pushing each character of sub back onto the stack count number of times.
After processing all characters in s, the code fetches the final result from the stack by popping all remaining letters from the stack and inserting them at the beginning of retv, a StringBuilder variable.
The decoded string is obtained by converting retv to a string using toString() and returned.
 */
