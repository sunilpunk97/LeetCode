package com.java.leetcode.Arrays;
//Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
//
//        A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
public class EqualRowAndColumnPairs_2352 {
    public int equalPairs(int[][] grid) {
        int length = grid.length;
        int count = 0;
        for(int row=0;row<length;row++){
            for(int col=0;col<length;col++){
                boolean isEqual = true;
                for(int i=0;i<length;i++){
                    if(grid[row][i] != grid[i][col]) {
                        isEqual = false;
                        break;
                    }
                }
                if(isEqual) count++;
            }
        }
        return count;
    }
}
//
//    It starts by initializing the variable len to the length of the grid, which represents the number of rows or columns in the square grid.
//
//        It initializes the variable count to 0, which will keep track of the number of equal pairs.
//
//        The code enters two nested for loops. The outer loop iterates over each row (ri) of the grid, and the inner loop iterates over each column (cj) of the grid.
//
//        For each combination of ri and cj, it sets a boolean variable isEqual to true.
//
//        It enters another for loop that iterates from 0 to len-1, representing the index i. This loop checks if the values at grid[ri][i] and grid[i][cj] are not equal. If they are not equal, it sets isEqual to false and breaks out of the loop.
//
//        After the inner loop completes, it checks if isEqual is still true. If it is, it means all the corresponding values in the row and column are equal, and it increments count by 1.
//
//        The code continues the iterations of the outer and inner loops until all combinations of ri and cj are checked.

//        Finally, it returns the value of count, which represents the number of equal pairs found in the grid.
