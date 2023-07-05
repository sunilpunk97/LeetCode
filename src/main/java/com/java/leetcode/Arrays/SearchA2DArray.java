package com.java.leetcode.Arrays;

public class SearchA2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows * columns -1;// setting right boundary to the last  elemnt of the matrix;
        while(left <= right){ //implementing binary search
            int midpoint = left + (right - left)/2; //we are treating it as a 1D array and calculating midpoint
            int midpoint_element = matrix[midpoint/columns][midpoint%columns];//since its a 2D matrix matrix[midpoint] gives a wrong value. so we calculate exact mp element.
            if(midpoint_element == target)
                return true;
            else if (midpoint_element < target) {
                left = midpoint + 1;
            }else
                right = midpoint -1;
        }
        return false;
    }
}

//Algo;
//        Get the number of rows and columns of the input matrix.
//
//        Set left to 0, which is the index of the first element in the flattened matrix.
//
//        Set right to rows * columns - 1, which is the index of the last element in the flattened matrix.
//
//        While left is less than or equal to right, do the following:
//
//        a. Calculate the midpoint index using (left + right) / 2.
//
//        b. Convert the midpoint index to a 2D index using integer division and modulo operations to get the row and column indices respectively.
//              matrix[midpoint/columns][midpoint%columns];
//        c. Get the value of the element at the midpoint index in the matrix.
//
//        d. If the midpoint element is equal to the target, return true.
//
//        e. If the midpoint element is less than the target, set left to midpoint + 1.
//
//        f. If the midpoint element is greater than the target, set right to midpoint - 1.
//
//        If the target is not found after the while loop, return false.
