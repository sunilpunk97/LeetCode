package com.java.leetcode.Strings;
//Given a string s, reverse only all the vowels in the string and return it.
//
//        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//        Example 1:
//
//        Input: s = "hello"
//        Output: "holle"
//        Example 2:
//
//        Input: s = "leetcode"
//        Output: "leotcede"
//        Constraints:
//        1 <= s.length <= 3 * 105
//        s consist of printable ASCII characters.
public class ReverseVowels_345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray(); // Convert the input string to a character array
        int left = 0; // Pointer for the leftmost character
        int right = chars.length - 1; // Pointer for the rightmost character

        while (left < right) { // Loop until the pointers meet or cross each other
            if (isVowel(chars[left]) && isVowel(chars[right])) { // If both characters at the pointers are vowels
                char temp = chars[left]; // Swap the characters
                chars[left] = chars[right];
                chars[right] = temp;
                left++; // Move the pointers towards the center
                right--;
            } else if (isVowel(chars[left])) { // If only the left character is a vowel
                right--; // Move the right pointer towards the center
            } else { // If only the right character is a vowel or both are not vowels
                left++; // Move the left pointer towards the center
            }
        }

        return new String(chars); // Convert the modified character array back to a string and return
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Convert the character to lowercase to handle both uppercase and lowercase vowels
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; // Check if the character is a vowel
    }

}


