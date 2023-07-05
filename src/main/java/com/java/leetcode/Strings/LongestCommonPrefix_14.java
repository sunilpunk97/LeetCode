package com.java.leetcode.Strings;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String prefix = strs[0];
        for(int i=1; i< strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}

//    It first checks if the input array strs is empty. If it is, it returns an empty string since there are no strings to compare.
//
//        It initializes the prefix variable with the first string in the strs array.
//
//        Then, it iterates over the remaining strings in the array starting from the second string (strs[1]) up to the last string.
//
//        Within the loop, it checks if the current string (strs[i]) starts with the prefix. It uses the indexOf method to determine if prefix is a substring of strs[i]. If the index is not zero, it means that prefix is not a prefix of strs[i].
//
//        If prefix is not a prefix of strs[i], the code enters a while loop. It keeps removing the last character of prefix using the substring method until it becomes a prefix of strs[i].
//
//        Once the while loop ends, it moves on to the next string in the array and repeats the process.
//
//        Finally, it returns the prefix, which represents the longest common prefix among all the strings in the array.
