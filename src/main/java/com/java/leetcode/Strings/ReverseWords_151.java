package com.java.leetcode.Strings;
/*
* Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 */
public class ReverseWords_151 {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder(); // Initialize a StringBuilder to store the reversed words
        int i = 0; // Initialize a pointer for traversing the input string
        int n = s.length() - 1; // Get the length of the input string

        while (i <= n) { // Iterate through the string
            while (i <= n && s.charAt(i) == ' ') // Skip leading spaces
                i++;

            if (i > n) // Break the loop if we have reached the end of the string
                break;

            int j = i + 1; // Initialize a pointer for finding the end of the current word
            while (j <= n && s.charAt(j) != ' ') // Find the end of the current word
                j++;

            String substr = s.substring(i, j); // Extract the current word as a substring

            if (result.length() == 0) // If this is the first word, append it to the StringBuilder
                result.append(substr);
            else // If not the first word, insert it at the beginning of the StringBuilder with a space
                result.insert(0, substr + " ");

            i = j + 1; // Move the pointer to the next position after the current word
        }

        return result.toString(); // Convert the StringBuilder to a String and return the result
    }


}

