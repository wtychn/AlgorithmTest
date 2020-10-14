package com.algorithm.tree;

import com.algorithm.tree.TreeNode;

/**
 * @program: AlgorithmTest
 * @description: lc110
 * @author: Mr.Wang
 * @create: 2020-08-17 11:31
 **/
public class LC_110_IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode node) {
        if(node == null) return 0;
        int left = recur(node.left), right = recur(node.right);
        if(left == -1 || right == -1 || Math.abs(left - right) > 1) return -1;
        else return Math.max(left, right) + 1;
    }
}
