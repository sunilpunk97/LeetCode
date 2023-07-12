package com.java.leetcode.Trees;
import java.util.*;

/*
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example 1:

Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]

Example 2:

Input: root = [1,null,3]
Output: [1,3]
Example 3:

Input: root = []
Output: []
*/

public class BinaryTreeRightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightView(root, result, 0);
        return result;

    }
    private void rightView(TreeNode curr, List<Integer> res, int currDepth){
        if(curr == null)
            return;
        if(currDepth == res.size())
            res.add(curr.val);
        rightView(curr.right, res, currDepth+1);
        rightView(curr.left, res, currDepth+1);
    }
}

/*
The function rightSideView takes the root of a binary tree (TreeNode root) as input and returns a list of integers representing the values of the nodes visible from the right side.
We create an empty ArrayList called result to store the values of the rightmost nodes.
The rightView function is called with the root node, result list, and initial depth of 0.
The rightView function is a recursive helper function that performs a depth-first search (DFS) traversal of the tree to identify the rightmost nodes at each level.
In the rightView function, we check if the current node (curr) is null. If it is, we return and backtrack in the recursion.
If the current depth (currDepth) is equal to the size of the result list, it means we have not encountered a node at this depth yet, so we add the value of the current node (curr.val) to the result list.
We recursively call the rightView function for the right child of the current node (curr.right) with an increased depth (currDepth + 1).
We recursively call the rightView function for the left child of the current node (curr.left) with an increased depth (currDepth + 1).
The DFS traversal continues until all nodes have been visited.
Finally, the result list containing the values of the rightmost nodes is returned.
 */
