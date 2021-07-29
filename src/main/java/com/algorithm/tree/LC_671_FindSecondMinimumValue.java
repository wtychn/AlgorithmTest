package com.algorithm.tree;
/***
 * @Description: 二叉树中第二小的结点
 * @level easy
 * @author wtychn
 * @Date 2021/7/27
 */
public class LC_671_FindSecondMinimumValue {
    int min, res;

    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        res = -1;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if(root.left == null) return;
        if(root.left.val == min) dfs(root.left);
        else res = res == -1 ? root.left.val : Math.min(res, root.left.val);
        if(root.right.val == min) dfs(root.right);
        else res = res == -1 ? root.right.val : Math.min(res, root.right.val);
    }
}
