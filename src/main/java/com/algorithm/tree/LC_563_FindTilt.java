package com.algorithm.tree;

/***
 * @Description: 二叉树的坡度
 * @level easy
 * @author wtychn
 * @Date 2021/11/18
 */
public class LC_563_FindTilt {
    int res = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int sumLeft = dfs(node.left);
        int sumRight = dfs(node.right);
        res += Math.abs(sumLeft - sumRight);
        return sumRight + sumLeft + node.val;
    }
}
