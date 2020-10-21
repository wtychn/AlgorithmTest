package com.algorithm.tree;

/***
 * @Description: 求二叉搜索树任意两节点之间的最小差
 * @level easy
 * @author wtychn
 * @Date 2020/10/12
 */
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
