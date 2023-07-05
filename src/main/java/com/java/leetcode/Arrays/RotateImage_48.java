package com.java.leetcode.Arrays;

public class RotateImage_48 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;//two step approach
        for(int i=0;i<len;i++){//first step convert row to colum  [1,2,3]     [1,4,7]
            for(int j=i;j<len;j++){                        ///    [4,5,6] ->  [2,5,8]
                int temp = matrix[i][j];                ///       [7,8,9]     [3,6,9]
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;//Basically a diagnol transpose 1 stays,2 and  4 are interchanged likewise 3 and 7 when 1st row and column is takken .
            }//the same is done and the matrix gets transposed rows and columns interchanged
        }
        for(int i=0;i<len;i++){// here we are doing a horizontal flip
            for(int j=0;j<(len/2);j++){//flipping each row first element of the row -> last element of the row.
                int temp = matrix[i][j];//the traversal fro each row is done till middle (len/2)
                matrix[i][j] = matrix[i][len-1-j];
                matrix[i][len-1-j] = temp;
            }
        }
    }
}


//    Get the length of the matrix and store it in len.
//
//        Iterate through each row and column of the matrix up to the diagonal, including the diagonal.
//
//        Swap the element at (i, j) with the element at (j, i).
//
//        This step effectively transposes the matrix.
//
//        After completing the above iteration, the matrix is transposed, but still not rotated.
//
//        Iterate through each row of the matrix again, up to the middle of the row.
//
//        Swap the element at (i, j) with the element at (i, len-1-j).
//
//        This step rotates the matrix by 90 degrees clockwise.
//
//        After completing the above iteration, the matrix is fully rotated by 90 degrees clockwise.