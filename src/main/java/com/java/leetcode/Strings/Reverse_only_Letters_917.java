package com.java.leetcode.Strings;

import java.util.Stack;

public class Reverse_only_Letters_917 {

    public String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(stack.pop());
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
//
//    It starts by creating a Stack called stack to store the letters in the string s in reverse order. The Stack data structure provides Last-In-First-Out (LIFO) behavior, which allows us to reverse the letters.
//
//        The code iterates over each character in the string s using a for loop. It checks if the character at index i is a letter using the Character.isLetter method.
//
//        If the character is a letter, it means we need to reverse it. In that case, the code pushes the character onto the stack.
//
//        After iterating over all characters in the string, it initializes a StringBuilder called sb to build the resulting string.
//
//        It iterates over each character in the string again using a for loop.
//
//        For each character, it checks if it is a letter using the Character.isLetter method.
//
//        If the character is a letter, it means we need to replace it with the reversed letter from the stack. The code pops the top character from the stack and appends it to the sb StringBuilder.
//
//        If the character is not a letter, it means it's a non-letter character that should remain in its original position. In that case, it appends the character directly to the sb StringBuilder.
//
//        After iterating over all characters in the string, the sb StringBuilder will contain the reversed string with the letters reversed and non-letter characters unchanged.
//
//        Finally, it returns the sb StringBuilder converted to a string using the toString method.