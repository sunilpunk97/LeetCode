package com.java.leetcode.Trees;
/*You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

 */
public class SearchInaBinaryTree_400 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            // If the root is null, the tree is empty and the value cannot be found
            return null;
        }

        if (root.val == val) {
            // If the value of the current node is equal to the target value, return the current node
            return root;
        }

        if (val < root.val) {
            // If the target value is less than the value of the current node, recursively search in the left subtree
            return searchBST(root.left, val);
        } else {
            // If the target value is greater than the value of the current node, recursively search in the right subtree
            return searchBST(root.right, val);
        }

    }
}
