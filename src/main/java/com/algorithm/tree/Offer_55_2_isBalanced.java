package com.algorithm.tree;

/**
 * @program: AlgorithmTest
 * @description: offer55-2
 * @author: Mr.Wang
 * @create: 2020-07-25 11:54
 **/
public class Offer_55_2_isBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return Math.abs(dfs(root.left, 0) - dfs(root.right, 0)) <= 1
                && isBalanced(root.left) && isBalanced(root.right);//判断子树是否平衡
    }

    private int dfs(TreeNode root, int count) {
        if(root == null) return count;
        count++;
        return Math.max(dfs(root.left, count), dfs(root.right, count));
    }
}
