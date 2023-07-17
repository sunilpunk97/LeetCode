package com.java.leetcode.Strings;

public class GcdOfTwoStrings {
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenating str1 and str2 is equal to concatenating str2 and str1
        // If not equal, it means there is no common divisor string, so return an empty string
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }

        // Find the length of the greatest common divisor between str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Return a substring of str1 from index 0 to the gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to calculate the greatest common divisor using the Euclidean algorithm
    private int gcd(int a, int b) {
        // If b is 0, it means a is the greatest common divisor, so return it
        if (b == 0) {
            return a;
        }

        // Recursively calculate the greatest common divisor of b and the remainder of a divided by b
        return gcd(b, a % b);
    }

}

