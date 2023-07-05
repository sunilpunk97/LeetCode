package com.java.leetcode.Strings;

public class IndexOfTheFirstOccurence_28 {

    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length()-needle.length()+1; i++){
            if(haystack.charAt(i) == needle.charAt(0))
                if(haystack.substring(i, needle.length()+i).equals(needle))
                    return i;
        }
        return -1;
    }
}

//    The first step  is to  travel to the haystack string  and we are checking for the occurrence of the first character of the needle string.
//
//        Suppose if we find the matching character, that is the haystack character and starting character of the needle string are equal.
//
//        Then we search for the substring in the haystack (starting from the position containing the first character of the needle string to the length of the needle string plus the index, substring(i, needle.length()+i)
//
//        suppose if the substring equals the needle then we return the index.
//
//        else we just return -1.
//
//        Since we are searching for  a particular string inside another string,  the loop limit should be  Haystack length minus the needle length.
