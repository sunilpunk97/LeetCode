package com.java.leetcode.Arrays;

public class CountPrimes_204 {
//    Given an integer n, return the number of prime numbers that are strictly less than n.
    public int countPrimes(int n) {
        int count = 0;
        boolean[] prime = new boolean[n];
        for(int i=0;i<prime.length;i++){
            prime[i] = true;
        }
        for(int i=2; i*i < prime.length;i++){
            if (prime[i]){
                for(int j=i; i*j< prime.length;j++){
                    prime[i * j] = false;
                }
            }
        }
        for(int i=2;i < prime.length;i++){
            if(prime[i]){
                count++;
            }
        }
        return count;
    }
}

//Algo:
//        Create a boolean array of size n named 'prime' and set all elements to true initially.
//
//        Loop through the array starting from 2 (the first prime number) until the square root of n, checking for primes using the following steps:
//
//        a. If prime[i] is true, then mark all multiples of i (starting from i^2) as false in the 'prime' array.
//
//        b. This is because any smaller multiples of i would have already been marked as false by a previous iteration, as they are multiples of smaller primes.
//
//        Loop through the 'prime' array from index 2 to n and count the number of true values, which correspond to prime numbers.
//
//        Return the count.