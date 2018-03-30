package org.hunter.challenge.solution.hackerrank.coding1;

/**
 * Created by Hunter on 29/03/2018.
 *  Note: We do not consider a binary tree to be a binary search tree if it contains duplicate values.
 * left side less than root-1 and great than 0(why -1 ? see Note)
 * right side great than root+1 and less than 10000 (why +1 ? see Note)
 */
public class C7_BST_NotSure {
    boolean checkBST(Node root) {
        return recurCheck(root, 0, 10000);
    }

    boolean recurCheck(Node node, int min, int max) {
        if (node != null) {
            if (node.data < min || node.data > max) {
                return false;
            } else {
                return recurCheck(node.left, min, node.data - 1) && recurCheck(node.right, node.data - 1, max);
            }
        } else {
            return true;
        }
    }
}
