package com.java.leetcode.Arrays;
//Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
//
//        A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
public class EqualRowAndColumnPairs_2352 {
    public int equalPairs(int[][] grid) {
        // Get the length of the grid
        int length = grid.length;

        // Initialize a counter to keep track of the equal pairs
        int count = 0;

        // Iterate through each row in the grid
        for (int row = 0; row < length; row++) {
            // Iterate through each column in the grid
            for (int col = 0; col < length; col++) {
                // Assume that the current cell is equal to all cells in its row and column
                boolean isEqual = true;

                // Compare the current cell with all cells in its row and column
                for (int i = 0; i < length; i++) {
                    // If the current cell is not equal to any cell in its row or column, set isEqual to false and break the loop
                    if (grid[row][i] != grid[i][col]) {
                        isEqual = false;
                        break;
                    }
                }

                // If isEqual is true, all cells in the current row and column are equal, so increment the count
                if (isEqual) {
                    count++;
                }
            }
        }

        // Return the count of equal pairs
        return count;
    }
dec
}


