package com.java.leetcode.Trees;

//Given an integer array nums where the elements are sorted in ascending order, convert it to a
//        height-balanced
//        binary search tree.
//
//
//
//        Example 1:
//
//
//        Input: nums = [-10,-3,0,5,9]
//        Output: [0,-3,9,-10,null,5]
//        Explanation: [0,-10,5,null,-3,null,9] is also accepted:

public class ConvertSortedArrayToBinarySearchTree_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        return conversionFunction(nums, 0, nums.length-1);
    }
    public TreeNode conversionFunction(int[] nums,int left, int right){
        if(left > right) return null;
        int midPoint = left + (right - left)/2; //The idea is to find the first middle element and start the recursion by making it as the head , since the array is already sorted
        TreeNode node = new TreeNode(nums[midPoint]);//so nodes to the left of mid are small, and to the right are bigger.
        node.left = conversionFunction(nums,left,midPoint-1);//So the same function is called to assign the left node for the initial middle(that is 0).For this the boundary to find the next middle is set from 0 to the element before the middle(mid-1).The newly found mid is the left node and this process continues recursively.
        node.right = conversionFunction(nums, midPoint+1, right);//Same happens for right node.
        return node;//finally the root node is returned.
    }
}

//ok

