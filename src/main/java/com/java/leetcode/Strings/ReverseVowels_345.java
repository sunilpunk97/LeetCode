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
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (isVowel(chars[left]) && isVowel(chars[right])) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            } else if (isVowel(chars[left])) {
                right--;
            } else {
                left++;
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

//Algo:
//        The reverseVowels method takes a string s as input and returns the string with only the vowels reversed.
//
//        Convert the string s to a character array called chars to make it easier to manipulate the characters.
//
//        Initialize two pointers, left and right, pointing to the start and end of the string, respectively.
//
//        Enter a while loop that continues as long as left is less than right.
//
//        Inside the loop, check if the character at index left is a vowel and the character at index right is also a vowel.
//
//        If both characters are vowels, swap them by using a temporary variable. Then, increment left and decrement right to move closer to the center of the string.
//
//        If the character at index left is a vowel but the character at index right is not a vowel, decrement right to skip it and move to the next character.
//
//        If the character at index left is not a vowel, increment left to skip it and move to the next character.
//
//        Repeat steps 5-8 until left becomes greater than or equal to right.
//
//        Convert the modified chars array back to a string using the new String(chars) constructor.
//
//        Return the resulting string with the reversed vowels.
