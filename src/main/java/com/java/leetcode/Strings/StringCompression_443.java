package com.java.leetcode.Strings;

public class StringCompression_443 {
    public int compress(char[] chars) { //REVISIT
        int index = 0;
        int i=0;
        while (i< chars.length){
            int j=i;
            while(j<chars.length && chars[i]==chars[j])
                j++;
            chars[index++] = chars[i];
            if(j-i > 1){
                String count = j-i + "";
                for(char ch: count.toCharArray()){
                    chars[index++] = ch;
                }
            }
            i = j;
        }
        return index;
    }
}

//    It initializes two variables: index to keep track of the current index in the compressed array, and i as a pointer to iterate through the original character array chars.
//
//        The code enters a while loop that continues until i reaches the end of the chars array.
//
//        Within the loop, it initializes another pointer j to find the end of the consecutive occurrence of the character at chars[i].
//
//        It increments j as long as chars[i] is equal to chars[j], which finds the length of the consecutive occurrence.
//
//        After determining the length of the consecutive occurrence, it assigns chars[i] to the chars[index] position in the compressed array.
//
//        If the length of the consecutive occurrence (j - i) is greater than 1, it means there are more than one occurrence of the character. In this case, it converts the count to a string and iterates over each character of the count, assigning them to the subsequent positions in the compressed array.
//
//        After handling the current character and its count, it updates i to j to move to the next character.
//
//        The loop continues until all characters in the original array have been processed.
//
//        Finally, it returns the value of index, which represents the length of the compressed array.
