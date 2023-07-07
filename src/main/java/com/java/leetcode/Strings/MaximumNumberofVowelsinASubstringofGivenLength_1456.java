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
        int currentVowels = 0;
        int maxVowels = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))
                currentVowels++;
        }
        maxVowels = currentVowels;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                currentVowels++;
            }
            if(isVowel(s.charAt(i-k))){
                currentVowels--;
            }
            maxVowels = Math.max(currentVowels,maxVowels);
        }
        return maxVowels;
    }
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

//Algo:
//        The maxVowels method takes a string s and an integer k as input and returns the maximum number of vowel letters in any substring of s with length k.
//
//        Initialize two variables: maxVowels to keep track of the maximum count of vowels encountered, and currentVowels to store the count of vowels in the current window.
//
//        Use a loop to calculate the number of vowels in the first window of size k. Iterate from index 0 to index k-1 of the string s. If the character at the current index is a vowel (determined using the isVowel method), increment currentVowels by 1.
//
//        Set maxVowels equal to currentVowels.
//
//        Slide the window by iterating from index k to the end of the string s. In each iteration, check if the character at the current index is a vowel and update currentVowels accordingly. Also, check if the character at the index i-k (the first character of the previous window) is a vowel and update currentVowels. This step ensures that the window size remains constant while moving forward.
//
//        Update maxVowels by taking the maximum value between maxVowels and currentVowels in each iteration.
//
//        After the loop, return maxVowels as the maximum count of vowels in any substring of s with length k.
