package com.algorithm.tree;

/**
 * @program: AlgorithmTest
 * @description: offer55
 * @author: Mr.Wang
 * @create: 2020-07-25 11:38
 **/
public class Offer_55_MaxDepth {
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int count) {
        if(root == null) return count;
        count++;
        return Math.max(dfs(root.left, count), dfs(root.right, count));
    }
}
