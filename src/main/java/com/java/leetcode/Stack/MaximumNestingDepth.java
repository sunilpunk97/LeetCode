package com.java.leetcode.Stack;
import java.util.*;

public class MaximumNestingDepth {
    public int maxDepth(String s) {
        int open = 0,depth=0;
        for(char c: s.toCharArray()){
            if(c=='(')
                open++;
            if(c==')')
                open--;
            depth=Math.max(depth,open);
        }
        return depth;
    }
}
//Simple
