package com.java.leetcode.Arrays;

import java.util.Arrays;

//Two strings are considered close if you can attain one from the other using the following operations:
//
//        Operation 1: Swap any two existing characters.
//        For example, abcde -> aecdb
//        Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
//        For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
//        You can use the operations on either string as many times as necessary.
//
//        Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;
        int[] freqMap1 = new int[26];
        int[] freqMap2 = new int[26];
        for(char ch:word1.toCharArray()){
            freqMap1[ch-97]++;
        }
        for(char ch:word2.toCharArray()){
            freqMap2[ch-97]++;
        }
        for(int i=0;i<26;i++){
            if(freqMap1[i]!=0 || freqMap2[i]!=0)
                if(freqMap1[i]==0 || freqMap2[i]==0)
                    return false;
        }
        Arrays.sort(freqMap1);
        Arrays.sort(freqMap2);
        for(int i=0;i<26;i++){
            if(freqMap1[i]!=freqMap2[i])
                return false;
        }
        return true;
    }
}

//    The code starts by checking if the lengths of word1 and word2 are equal. If they are not equal, it means we cannot attain one string from the other using the given operations, so the code returns false.
//
//        It initializes two integer arrays, freqMap1 and freqMap2, each of size 26. These arrays represent the frequency of characters in the respective words. The indices of the arrays correspond to the ASCII values of the lowercase letters, where 'a' has an index of 0, 'b' has an index of 1, and so on.
//
//        The code then iterates over the characters of word1 and word2 using the chars() method, and for each character, increments the corresponding frequency in the respective frequency maps.
//
//        After filling the frequency maps, the code checks if there exists a character that exists in one word and does not exist in the other word. If such a character is found, it means the characters in the two words are different, and the code returns false.
//
//        The frequency maps are then sorted using the Arrays.sort() method. Sorting the frequency maps ensures that we can compare the values of the frequency arrays accurately.
//
//        Finally, the code compares the values in the sorted frequency maps. If any value is different, it means the frequencies of characters in the two words are different, and the code returns false.
//
//        If the code reaches this point, it means all characters and their frequencies are the same in both words, and we can attain one string from the other using the given operations. In this case, the code returns true.
