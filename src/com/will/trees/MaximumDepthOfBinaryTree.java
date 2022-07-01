package com.will.trees;


import com.will.util.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }

        int value = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        return value;

    }
}
