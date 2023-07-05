package com.java.leetcode.Trees;

public class MaximumDepth_104 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l,r) + 1;
    }
}

//Check if the input root node is null, which means the tree is empty. If so, return 0.
//        Recursively compute the maximum depth of the left subtree of root by calling maxDepth with the left child of root as input, and store the result in variable l.
//        Recursively compute the maximum depth of the right subtree of root by calling maxDepth with the right child of root as input, and store the result in variable r.
//        Compute the maximum depth of the entire tree by taking the maximum of l and r, and adding 1 (for the root node).
//        Return the maximum depth computed in step 4.
