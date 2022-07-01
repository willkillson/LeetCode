package com.will.trees;

import com.will.util.TreeNode;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // base case
        if(p == null && q!=null){
            return false;
        }else if(q==null && p!=null){
            return false;
        }else if (q==null && p==null){
            return true;
        }else if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }

}
