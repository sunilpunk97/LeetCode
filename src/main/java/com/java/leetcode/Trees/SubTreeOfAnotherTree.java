package com.java.leetcode.Trees;

public class SubTreeOfAnotherTree {
//    If the "root" and "subRoot" are exactly the same, the function returns true, as the second tree is found to be the subtree of the first tree.
//
//    If the "root" and "subRoot" are not the same, the function recursively checks the left and right children of the "root" to see if the "subRoot" is found to be a subtree of either of them. The function keeps returning the OR condition of the two recursive calls until the "subRoot" is found to be a subtree of the "root".
//
//    If the "subRoot" is not found to be a subtree of the "root" after all the recursive calls, the function returns false.

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null)
            return false;
        else if (isSameTree(s,t)) {
            return true;
        }
        else {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }
    public boolean isSameTree(TreeNode s, TreeNode t){
        if(s == null || t == null)
            return s==null && t==null;
        else if (s.val == t.val) {
            return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
        }else {
            return false;
        }
    }
}
