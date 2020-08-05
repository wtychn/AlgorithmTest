package com.algorithm.tree;

import sun.reflect.generics.tree.Tree;

/**
 * @program: AlgorithmTest
 * @description: lc337
 * @author: Mr.Wang
 * @create: 2020-08-05 11:12
 **/
public class LC_337_Rob {
    public int rob(TreeNode root) {
        int[] result = dfs(root);
        return Math.max(result[0], result[1]);
    }

    private int[] dfs(TreeNode root) {
        if (root == null) return new int[]{0, 0};
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int selected = root.val + left[1] + right[1];
        int unselected = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{selected, unselected};
    }
}
