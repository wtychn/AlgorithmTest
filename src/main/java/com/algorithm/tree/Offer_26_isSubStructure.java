package com.algorithm.tree;

public class Offer_26_isSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null)
                && (recur(A, B)
                    || isSubStructure(A.left, B)
                    || isSubStructure(A.right, B));
    }

    //判断AB是否相等
    private boolean recur(TreeNode A, TreeNode B) {
        //B遍历完成，返回true
        if(B == null) return true;
        //A遍历完成或AB当前节点不等
        if(A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}
