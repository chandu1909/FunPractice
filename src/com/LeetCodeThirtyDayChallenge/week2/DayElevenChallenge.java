package com.LeetCodeThirtyDayChallenge.week2;

/**
 * @Author: Chandra sekhar Poalvarapu
 * @Description: Below program allows you to find the diameter of the binary tree.
 *
 */
public class DayElevenChallenge {
    TreeNode root;
    public int diameterOfBinaryTree(TreeNode root) {

        int leftHeight =0;
        int rightHeight=0;

        if (root == null){ //making sure root node is not null
            return 0;
        }
        leftHeight = height(root.left);
        rightHeight = height(root.right);

        int leftdiameter = diameterOfBinaryTree(root.left);
        int rightdiameter = diameterOfBinaryTree(root.right);
        //Max among left diameter, right diameter  or left diameter + right diameter
        return Math.max(leftHeight+rightHeight,Math.max(leftdiameter,rightdiameter));

    }

    /**
     * wrapper method
     * @return
     */
    int diameterOfBinaryTree()
    {
        return diameterOfBinaryTree(root);
    }

    private int height(TreeNode left) {
        if (left == null)return 0;

        return 1+Math.max(height(left.left),height(left.right));
    }
}
