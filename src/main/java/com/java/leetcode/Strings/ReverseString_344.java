package com.java.leetcode.Strings;

public class ReverseString_344 {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        char temp = 'a';
        while(start<end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
