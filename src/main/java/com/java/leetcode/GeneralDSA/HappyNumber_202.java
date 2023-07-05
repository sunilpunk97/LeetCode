package com.java.leetcode.GeneralDSA;

import java.util.HashSet;


public class HappyNumber_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1){
            int current = n;
            int sum = 0;
            while (current != 0){
                sum += (current%10) * (current%10);
                current /= 10;
            }
            if(seen.contains(sum))
                return false;

            seen.add(sum);
            n = sum;
        }
        return true;
    }
}

//    Initialize a HashSet called "seen" to keep track of the sums we've seen so far.
//        Enter a loop that runs until the given number "n" becomes 1. This loop will repeatedly calculate the sum of the squares of the digits of "n" until we either reach 1 or find a sum that we've already seen before.
//        Inside the loop, create a variable called "current" and set it to the current value of "n". Also create a variable called "sum" and set it to 0. These variables will be used to calculate the sum of the squares of the digits of "n".
//        Enter another loop that runs until "current" becomes 0. This loop will extract the digits of "current" one by one and square them, then add the squares to "sum".
//        After the inner loop finishes, check if "seen" already contains "sum". If it does, then we've encountered a sum that we've already seen before, and we can immediately return false, since we know that we're stuck in a loop and will never reach 1.
//        Otherwise, add "sum" to "seen" and update "n" to be equal to "sum".
//        Repeat steps 3-6 until "n" becomes 1, at which point we can return true.
