package com.will.trees;

import com.will.util.TreeNode;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {

        if(t == null){
            return true;
        }else if (s == null){
            return false;
        }

        if(this.isSameTree(s,t)){
            return true;
        }
        return (this.isSubtree(s.left,t)|| this.isSubtree(s.right,t));


    }

    // public boolean sameTree(TreeNode s, TreeNode t){
    //     if(s==null && t == null){
    //          return true;
    //     }else if ((s != null && t != null) && (s.val == t.val)){
    //         return (this.sameTree(s.left,t.right) && this.sameTree(s.right, t.right));
    //     }
    //     return false;
    // }




    // public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    // 	if(root==null && subRoot==null) return true;
    // 	if(root==null) return false;
    // 	boolean isSame = false;
    // 	if(root.val==subRoot.val)
    // 		isSame = isSameTree(root,subRoot);
    // 	return isSame || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    // }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p!=null && q==null) return false;
        if(p==null && q!=null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

}
