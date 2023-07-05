package com.java.leetcode.StackAndQueue;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> blah = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '(' ||  s.charAt(i)== '{' || s.charAt(i)== '[')
                blah.push(s.charAt(i));
            else if(s.charAt(i) == ')' && !blah.empty() && blah.peek() == '(')
                blah.pop();
            else if(s.charAt(i) == '}' && !blah.empty() && blah.peek() == '{')
                blah.pop();
            else if(s.charAt(i) == ']' && !blah.empty() && blah.peek() == '[')
                blah.pop();
            else
                return false;
        }
        return blah.empty();
    }
}
