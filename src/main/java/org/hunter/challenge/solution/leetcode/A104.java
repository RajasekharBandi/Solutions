package org.hunter.challenge.solution.leetcode;

/**
 * Created by Hunter on 5/04/2018.
 */


public class A104 {
    public static void main(String[] args) {
        System.out.println();
    }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }else {
            return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
        }

    }
}
