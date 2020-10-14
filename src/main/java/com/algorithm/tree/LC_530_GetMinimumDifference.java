package com.algorithm.tree;

import sun.reflect.generics.tree.Tree;

public class LC_530_GetMinimumDifference {
    int min, pre;

    public int getMinimumDifference(TreeNode root) {
        min = Integer.MAX_VALUE;
        pre = -1;
        recur(root);
        return min;
    }

    private void recur(TreeNode node) {
        if(node == null) return;
        recur(node.left);
        if (pre != -1) {
            min = Math.min(min, node.val - pre);
        }
        pre = node.val;
        recur(node.right);
    }
}
