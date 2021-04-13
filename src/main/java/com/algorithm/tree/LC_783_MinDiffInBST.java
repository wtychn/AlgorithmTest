package com.algorithm.tree;
/***
 * @Description: 二叉搜索树节点最小距离  
 * @level easy
 * @author wtychn
 * @Date 2021/4/13
 */
public class LC_783_MinDiffInBST {
    int last, min;

    public int minDiffInBST(TreeNode root) {
        last = -1;
        min = Integer.MAX_VALUE;
        recur(root);
        return min;
    }

    private void recur(TreeNode root) {
        if(root == null) return;
        recur(root.left);
        if (last >= 0) {
            min = Math.min(min, root.val - last);
        }
        last = root.val;
        recur(root.right);
    }
}
