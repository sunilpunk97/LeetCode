package com.java.leetcode.Strings;
//Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
//
//        You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
public class AddStrings_415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while(i >=0 || j>=0){
            int sum = carry; //Initial carry will always be zero
            if(i>=0)
                sum += num1.charAt(i--) - '0';
            if(j>=0)
                sum += num2.charAt(j--) - '0';
            res.append(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0)
            res.append(carry);
        return res.reverse().toString();
    }
}
//    Initialize variables:
//
//        Set i as the index of the last character in num1.
//        Set j as the index of the last character in num2.
//        Set carry as 0 to keep track of any carry during addition.
//        Create a StringBuilder named res to store the result.
//        Iterate through the strings from right to left (starting from the last digit):
//
//        While either i or j is greater than or equal to 0:
//        Set sum as the current value of carry.
//        If i is greater than or equal to 0, add the numeric value of the character at index i in num1 to sum and decrement i.
//        If j is greater than or equal to 0, add the numeric value of the character at index j in num2 to sum and decrement j.
//        Calculate the current digit and update the carry:
//
//        Append the last digit of sum (obtained by sum % 10) to the result res.
//        Update the carry by dividing sum by 10 (carry = sum / 10).
//        Check for any remaining carry:
//
//        After the loop ends, check if there is any remaining carry. If carry is not zero, append it to res.
//        Return the final sum:
//
//        Reverse the string stored in res using the reverse() method.
//        Convert the reversed StringBuilder to a string using the toString() method.
//        Return the resulting string as the sum of the input numbers.
