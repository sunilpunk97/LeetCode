package com.java.leetcode.Stack;
/***
 * You are given a string s, which contains stars *.
 *
 * In one operation, you can:
 * Choose a star in s.
 * Remove the closest non-star character to its left, as well as remove the star itself.
 * Return the string after all stars have been removed.
 * Note:
 * The input will be generated such that the operation is always possible.
 * It can be shown that the resulting string will always be unique.
 * Example 1:
 *
 * Input: s = "leet**cod*e"
 * Output: "lecoe"
 * Explanation: Performing the removals from left to right:
 * - The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
 * - The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
 * - The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
 * There are no more stars, so we return "lecoe".
 */

import java.util.Stack;

public class RemoveStarsFromString_2390 {
    public String removeStars(String s) {
        Stack<Character> myStack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '*'){
                if(!myStack.isEmpty()){
                    myStack.pop();
                }
            }else {
                myStack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!myStack.isEmpty()){
            sb.insert(0,myStack.pop());
        }
        return sb.toString();
    }
}

//    The removeStars method takes a string s as input and returns the resulting string after removing stars according to the given rules.
//
//        Create a Stack<Character> called stack to store the non-star characters encountered.
//
//        Iterate through each character c in the string s using a for-each loop.
//
//        If the current character c is not a star '*', push it onto the stack since it is a non-star character.
//
//        If the current character c is a star and the stack is not empty, it means we have encountered a star that needs to be removed along with the non-star character closest to the left. In this case, we pop the top character from the stack to remove the non-star character.
//
//        After iterating through all the characters in s, the stack contains the non-star characters that were not removed. We need to build the resulting string by reversing the order of these characters.
//
//        Create a StringBuilder called sb to build the resulting string.
//
//        Use a while loop to pop characters from the stack until it becomes empty. In each iteration, insert the popped character at the beginning of the sb StringBuilder using insert(0, character).
//
//        After the while loop, the sb StringBuilder contains the resulting string with non-star characters in the correct order.
//
//        Finally, convert the sb StringBuilder to a string using toString() and return it as the resulting string after removing stars.
