package com.java.leetcode.BinarySearch;

public class GuessNumber_374 {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (true){
            int mid = low + (high - low) / 2;
            int myGuess = guess(mid , 6);
            if(myGuess == 0)
                return myGuess;
            else if (myGuess == -1) {
                high = mid-1;
            }else
                low = mid+1;

        }
    }
    private int guess(int guess, int val){
        if(guess == val) return 0;
        else if (guess > val) {
            return -1;
        }
        else
            return 1;
    }
}
