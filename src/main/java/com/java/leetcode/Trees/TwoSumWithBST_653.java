package com.java.leetcode.Trees;
import java.util.*;

//Given the root of a binary search tree and an integer k, return true if there exist two elements in the BST such that their sum is equal to k, or false otherwise.
//
//
//
//        Example 1:
//
//
//        Input: root = [5,3,6,2,4,null,7], k = 9
//        Output: true
//
//        Input: root = [5,3,6,2,4,null,7], k = 28
//        Output: false

public class TwoSumWithBST_653 {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> mySet = new HashSet<>();
        return twoSumIdentifier(root,mySet,k);
    }
    private boolean twoSumIdentifier(TreeNode root, Set<Integer> mySet, int k){
        if(root == null){
            return false;
        }
        int otherHalf = k - root.val;
        if(mySet.contains(otherHalf))
            return true;
        mySet.add(root.val);
        return twoSumIdentifier(root.left, mySet, k) || twoSumIdentifier(root.right, mySet, k);
    }
}
