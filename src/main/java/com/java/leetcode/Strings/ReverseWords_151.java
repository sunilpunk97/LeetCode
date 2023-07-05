package com.java.leetcode.Strings;

public class ReverseWords_151 {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = s.length() - 1;
        while (i <= n) {
            while (i <= n && s.charAt(i) == ' ')
                i++;
            if (i > n) break;
            int j = i + 1;
            while (j <= n && s.charAt(j) != ' ')
                j++;
            String substr = s.substring(i, j);
            if (result.length() == 0)
                result.append(substr);
            else
                result.insert(0, substr + " ");
            i = j + 1;
        }
        return result.toString();
    }

}

//    Create a StringBuilder called 'result' to store the reversed words.
//
//        Initialize an integer 'i' to 0, representing the start index of the current word.
//
//        Initialize an integer 'n' to the length of the string 's' minus 1, representing the end index of the string.
//
//        Enter a while loop that continues until 'i' is less than or equal to 'n'.
//
//        Inside the loop, advance 'i' until it reaches a non-space character. This step skips any leading spaces before a word.
//
//        Check if 'i' has exceeded 'n'. If true, it means all words have been processed, so break out of the loop.
//
//        Initialize an integer 'j' to 'i' + 1, representing the start index of the next word.
//
//        Inside a nested while loop, advance 'j' until it reaches a space character or the end of the string. This step finds the end index of the current word.
//
//        Extract the substring from 's' starting at index 'i' and ending at index 'j' - 1. This substring represents the current word.
//
//        Check if 'result' is empty. If true, it means no words have been added yet, so append the current word to 'result'.
//
//        If 'result' is not empty, insert the current word followed by a space at the beginning of 'result'. This step ensures the words are added in reverse order with spaces between them.
//
//        Set 'i' to 'j' + 1, moving 'i' to the index following the space after the current word.
//
//        Repeat steps 5-12 until 'i' exceeds 'n'.
//
//        After the loop, convert 'result' to a String using the 'toString' method.
//
//        Return the reversed string obtained from 'result'.
