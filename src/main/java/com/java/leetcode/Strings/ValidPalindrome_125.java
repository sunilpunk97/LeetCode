package com.java.leetcode.Strings;

public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        String myString = "";
        for(char c:s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c))
                myString += c;
        }
        myString=myString.toLowerCase();
        int a_pointer = 0;
        int b_pointer = myString.length()-1;
        while(a_pointer<=b_pointer){
            if(myString.charAt(a_pointer) != myString.charAt(b_pointer))
                return false;
            else {
                a_pointer+=1;
                b_pointer-=1;
            }
        }
        return true;
    }
}

//    It starts by initializing an empty string myString to store the alphanumeric characters extracted from the input string s.
//
//        It iterates over each character in the string s using a for-each loop.
//
//        For each character, it checks if it is a digit or a letter using the Character.isDigit and Character.isLetter methods. If it is alphanumeric, it appends it to the myString string.
//
//        After extracting the alphanumeric characters, it converts the myString string to lowercase using the toLowerCase method. This step ensures case insensitivity when checking for palindromes.
//
//        It initializes two pointers, a_pointer and b_pointer, which start from the beginning and the end of the myString string, respectively.
//
//        The code enters a while loop that continues until the a_pointer is less than or equal to the b_pointer.
//
//        Within the loop, it compares the characters at the a_pointer and b_pointer positions in the myString string. If they are not equal, it means the string is not a palindrome, and the code returns false.
//
//        If the characters at the current positions are equal, it increments the a_pointer and decrements the b_pointer to move towards the center of the string.
//
//        After the loop, if the code has not returned false, it means the string is a palindrome, and it returns true.
