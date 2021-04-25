package com.algorithm.tree;
/***
 * @Description: 递增顺序搜索树
 * @level easy
 * @author wtychn
 * @Date 2021/4/25
 */
public class LC_897_IncreasingBST {
    TreeNode pre, last;

    public TreeNode increasingBST(TreeNode root) {
        pre = null;
        last = null;
        inOrderTraversal(root);
        return pre;
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        if(pre == null) pre = node;
        if (last != null) last.right = node;
        node.left = null;
        last = node;
        inOrderTraversal(node.right);
    }
}
