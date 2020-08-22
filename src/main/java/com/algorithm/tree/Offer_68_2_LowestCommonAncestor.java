package com.algorithm.tree;

/**
 * @program: AlgorithmTest
 * @description: offer68-2
 * @author: Mr.Wang
 * @create: 2020-08-03 11:49
 **/
public class Offer_68_2_LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }
}
