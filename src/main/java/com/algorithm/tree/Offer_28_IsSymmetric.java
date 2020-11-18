package com.algorithm.tree;

public class Offer_28_IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isEqual(root.left, root.right);
    }

    private boolean isEqual(TreeNode A, TreeNode B) {
        //终止条件：两侧都递归到空值
        if (A == null && B == null) return true;
        //或者出现不相等，注意：判空放前面，避免出现npe
        if (A == null || B == null || A.val != B.val) return false;
        return isEqual(A.left, B.right) && isEqual(A.right, B.left);
    }
}
