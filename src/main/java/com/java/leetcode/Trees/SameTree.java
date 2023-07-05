package com.java.leetcode.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        }else
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

//Straight forward
//check whether both are null at first , if yes,then true
//If either one of the tree root is null then false.
//if the rrot values differ they are false.

