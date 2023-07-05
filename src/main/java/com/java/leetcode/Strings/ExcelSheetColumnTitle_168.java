package com.java.leetcode.Strings;

public class ExcelSheetColumnTitle_168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder myBuilder = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char right_most_alphabet = (char)(columnNumber%26 + 'A');
            myBuilder.append(right_most_alphabet);
            columnNumber = columnNumber/26;
        }
        return myBuilder.reverse().toString();
    }

}

//    Create a StringBuilder called 'myBuilder' to store the resulting column title.
//
//        Enter a while loop that continues until the 'columnNumber' is greater than 0.
//
//        Decrement 'columnNumber' by 1. This step is performed to adjust the mapping from 1-based column numbers to 0-based indices.
//
//        Calculate the remainder of 'columnNumber' divided by 26, which represents the rightmost alphabet digit in the column title. Add the ASCII value of 'A' to this remainder to convert it into the corresponding uppercase alphabet character.
//
//        Append the rightmost alphabet character to the 'myBuilder'.
//
//        Update 'columnNumber' by dividing it by 26, performing integer division. This step effectively moves to the next digit in the column title.
//
//        Repeat steps 3-6 until 'columnNumber' becomes 0.
//
//        After the loop, reverse the contents of 'myBuilder' using the 'reverse' method.
//
//        Convert 'myBuilder' to a String using the 'toString' method.
//
//        Return the resulting column title as a String.
