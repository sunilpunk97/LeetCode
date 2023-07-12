package com.java.leetcode.Trees;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees_872 {
    ArrayList<Integer> leaf1 = new ArrayList<>();
    ArrayList<Integer> leaf2 = new ArrayList<>();

    // Main method to check if leaf nodes are similar in two binary trees
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // Collect leaf nodes of the first tree
        leaf1 = findLeafNodes(root1, leaf1);
        // Collect leaf nodes of the second tree
        leaf2 = findLeafNodes(root2, leaf2);

        // Compare the collected leaf nodes of both trees
        return leaf1.equals(leaf2);
    }

    // Helper method to collect leaf nodes of a binary tree
    public static ArrayList<Integer> findLeafNodes(TreeNode root, ArrayList<Integer> leaf) {
        // Base case: If root is null, there are no leaf nodes
        if (root == null) {
            return null;
        }

        // Check if the current node is a leaf node (no left and right children)
        if (root.left == null && root.right == null) {
            // Add the leaf node value to the leaf list
            leaf.add(root.val);
        }

        // Recursively traverse the left subtree to find leaf nodes
        findLeafNodes(root.left, leaf);

        // Recursively traverse the right subtree to find leaf nodes
        findLeafNodes(root.right, leaf);

        // Return the updated leaf list
        return leaf;
    }
}
