package com.java.leetcode.Trees;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;
    }
}

//Check if the input root is null, i.e., the tree is empty.
//        If root is not null, recursively invert the left and right subtrees of root using invertTree method and store them in two new nodes called left and right, respectively.
//        Swap the left and right subtrees of root by assigning left to root.right and right to root.left.
//        Return the inverted root.
