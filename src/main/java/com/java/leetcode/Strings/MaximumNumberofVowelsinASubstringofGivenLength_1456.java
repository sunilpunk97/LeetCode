package com.java.leetcode.Strings;
//SlidingWindow
//Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
//
//        Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
//        Example 1:
//
//        Input: s = "abciiidef", k = 3
//        Output: 3
//        Explanation: The substring "iii" contains 3 vowel letters.

public class MaximumNumberofVowelsinASubstringofGivenLength_1456 {
    public int maxVowels(String s, int k) {
        // Initialize variables to keep track of the current and maximum count of vowels
        int currentVowels = 0;
        int maxVowels = 0;

        // Iterate through the first window of length k
        for(int i = 0; i < k; i++) {
            // If the current character is a vowel, increment the current count of vowels
            if(isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }

        // Set the maximum count of vowels equal to the current count of vowels
        maxVowels = currentVowels;

        // Slide the window and update the count of vowels
        for(int i = k; i < s.length(); i++) {
            // If the current character is a vowel, increment the current count of vowels
            if(isVowel(s.charAt(i))) {
                currentVowels++;
            }

            // If the character at i-k (the leftmost character of the window) is a vowel,
            // decrement the current count of vowels since it is no longer included in the window
            if(isVowel(s.charAt(i - k))) {
                currentVowels--;
            }

            // Update the maximum count of vowels by taking the maximum of the current count and the previous maximum
            maxVowels = Math.max(currentVowels, maxVowels);
        }

        // Return the maximum count of vowels
        return maxVowels;
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}

