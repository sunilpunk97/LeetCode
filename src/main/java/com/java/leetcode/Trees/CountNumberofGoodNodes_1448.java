package com.java.leetcode.Trees;

public class CountNumberofGoodNodes_1448 {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val); // Call dfs method with the root node and initial maximum value set to root's value
    }

    private int dfs(TreeNode node, int maxVal) {
        if (node == null) {
            return 0; // Base case: If node is null, return 0 (no good nodes)
        }

        int res = (node.val >= maxVal) ? 1 : 0; // Check if the current node's value is greater than or equal to the maximum value seen so far. If true, it is a good node, so set res to 1; otherwise, set res to 0.
        maxVal = Math.max(maxVal, node.val); // Update the maximum value seen so far to be the maximum of the current maximum value and the value of the current node

        // Recursively calculate the number of good nodes in the left and right subtrees, passing the updated maximum value
        res += dfs(node.left, maxVal);
        res += dfs(node.right, maxVal);

        return res; // Return the total number of good nodes
    }
}
