package com.algorithm.tree;

/**
 * @program: AlgorithmTest
 * @description: lc100
 * @author: Mr.Wang
 * @create: 2020-08-07 09:33
 **/
public class LC_100_IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
