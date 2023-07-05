package com.java.leetcode.GeneralDSA;

public class ReverseInteger_7 {
    public int reverse(int x) {
        long reverse = 0;
        while(x != 0){
            reverse = reverse*10 + (x%10);
            x = x/10;
            if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
                return 0;
        }
        return (int) reverse;
    }
}
//    Basic thing is we have to memorize the   reverse formula
//
//    we have to check the condition
//
//if the reverse value is greater than the integer maximum value  it is less than the integer minimum value.
//
//        We just have to return 0
//
//        or after the completion of the loop  we just have to return the Reversed number.
//
//        Basically while the given number is not equal to 0 we have to make use of the rivers formula on each Loop.
//
//        And also on each Loop be have to check the condition which is indicated above
