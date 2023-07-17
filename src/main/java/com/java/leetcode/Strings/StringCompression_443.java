package com.java.leetcode.Strings;
/*Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

 */
public class StringCompression_443 {
    public int compress(char[] chars) {
        int index = 0; // Index to keep track of the current position to write the compressed characters
        int i = 0; // Pointer to iterate through the original characters array

        // Iterate through the original characters array
        while (i < chars.length) {
            int j = i; // Pointer to find the end of a sequence of identical characters

            // Move the 'j' pointer to the end of the sequence of identical characters
            while (j < chars.length && chars[i] == chars[j])
                j++;

            chars[index++] = chars[i]; // Write the current character to the compressed characters array

            // If the sequence has more than one character, write the count of the sequence
            if (j - i > 1) {
                String count = (j - i) + ""; // Convert the count to a string

                // Write each digit of the count to the compressed characters array
                for (char ch : count.toCharArray()) {
                    chars[index++] = ch;
                }
            }

            i = j; // Move the 'i' pointer to the next unique character or the end of the array
        }

        return index; // Return the length of the compressed characters array
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
