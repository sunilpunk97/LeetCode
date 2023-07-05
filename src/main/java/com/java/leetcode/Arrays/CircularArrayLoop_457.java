package com.java.leetcode.Arrays;

public class CircularArrayLoop_457 {
    public boolean circularArrayLoop(int[] arr) {
        for(int i=0;i< arr.length;i++){
            int slow, fast;
            slow = fast = i;
            boolean ifForward = arr[i]>0;

            while(true){
                slow = getNextPosition(arr, slow, ifForward);
                if(slow == -1){
                    break;
                }
                fast = getNextPosition(arr, fast, ifForward);
                if(fast == -1){
                    break;
                }
                fast = getNextPosition(arr, fast, ifForward);
                if(fast == -1){
                    break;
                }
                if(slow == fast){
                    return true;
                }
            }
        }
        return false;
    }

    private  static int getNextPosition(int[] arr, int index, boolean iForward){
        boolean direction = arr[index] >= 0;
        if(direction != iForward){
            return -1;
        }
        int nextIndex = (index+arr[index]) % arr.length;
        if(nextIndex < 0){
            nextIndex = nextIndex + arr.length;
        }
        if(nextIndex == index){
            return -1;
        }
        return nextIndex;

    }
}
