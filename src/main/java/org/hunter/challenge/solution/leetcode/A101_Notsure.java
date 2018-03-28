package org.hunter.challenge.solution.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Hunter on 16/03/2018.
 */
public class A101_Notsure {
    public boolean isSymmetric(TreeNode root) {
        //1,2,2,3,4,4,3,
        if (root != null) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            if (left.val == right.val) {

            } else {
                return false;
            }

        } else {

        }

        return true;
    }

//    public boolean isMirror(TreeNode left,TreeNode right){
//        if(left==null && right==null) return true;
//        if(left==null || right == null) return false;
//
//    }

}
