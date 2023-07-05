package com.java.leetcode.Strings;

public class GcdOfTwoStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

//    The gcdOfStrings method takes two strings, str1 and str2, as input and returns the largest string that divides both str1 and str2.
//
//        First, we check if concatenating str1 and str2 is equal to concatenating str2 and str1. If they are not equal, it means there is no common divisor, so we return an empty string "".
//
//        If the concatenation is equal, we calculate the greatest common divisor (GCD) of the lengths of str1 and str2. The GCD will represent the length of the largest common divisor string.
//
//        We use the gcd method to calculate the GCD recursively. This method uses the Euclidean algorithm to find the GCD of two numbers.
//
//        Finally, we return the substring of str1 from index 0 to the length of the GCD as the largest common divisor string.