package com.java.leetcode.Strings;
import java.util.*;

public class ReverseWordsInString_557 {
    public String reverseWords(String s) {
//        String[] SplittedArray = s.split(" ");
//        StringBuilder result = new StringBuilder();
//        for(String word: SplittedArray){
//            StringBuilder sb = new StringBuilder();
//            sb.append(word);
//            sb.reverse();
//            result.append(sb.toString()+" ");
//
//        }
//        result.setLength(result.length()-1);
//        return result.toString();
        int start = 0;
        int end = 0;
        char[] charArr = s.toCharArray();
        while(end < charArr.length){
            while(end < charArr.length && charArr[end] != ' '){
                end++;
            }
            reverse(charArr,start,end-1);
            start = end+1;
            end = start;
        }
        return new String(charArr);
    }
    private void reverse (char[] charArr, int left, int right){
        while(left<right){
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
    }
}
