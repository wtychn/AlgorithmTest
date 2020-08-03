package com.algorithm.tree;

/**
 * @program: AlgorithmTest
 * @description: offer68
 * @author: Mr.Wang
 * @create: 2020-08-03 10:52
 **/
public class Offer_68_LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }
        //利用二叉搜索树特性
        while (root != null) {
            if (root.val < p.val)
                root = root.right;
            else if (root.val > q.val)
                root = root.left;
            else break;
        }
        return root;
    }
}
