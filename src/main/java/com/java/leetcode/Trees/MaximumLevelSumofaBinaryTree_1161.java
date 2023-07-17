package com.java.leetcode.Trees;
import java.util.*;

/*Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

Return the smallest level x such that the sum of all the values of nodes at level x is maximal.*/

public class MaximumLevelSumofaBinaryTree_1161 {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>(); // Create a queue to perform level order traversal
        queue.add(root); // Add the root node to the queue
        int maxLevel = 1; // Track the level with the maximum sum
        int maxSum = Integer.MIN_VALUE; // Track the maximum sum found
        int level = 1; // Track the current level

        while (!queue.isEmpty()) {
            int levelSum = 0; // Sum of node values at the current level
            int levelSize = queue.size(); // Number of nodes at the current level

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll(); // Retrieve the front node from the queue
                levelSum += node.val; // Add the value of the current node to the level sum

                if (node.left != null) {
                    queue.add(node.left); // Add the left child of the current node to the queue
                }
                if (node.right != null) {
                    queue.add(node.right); // Add the right child of the current node to the queue
                }
            }

            if (levelSum > maxSum) {
                maxSum = levelSum; // Update the maximum sum found
                maxLevel = level; // Update the level with the maximum sum
            }

            level++; // Move to the next level
        }

        return maxLevel; // Return the level with the maximum sum
    }
}
