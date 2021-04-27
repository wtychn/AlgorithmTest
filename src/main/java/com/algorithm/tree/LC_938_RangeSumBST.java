package com.algorithm.tree;
/***
 * @Description: 二叉搜索树的范围和
 * @level easy
 * @author wtychn
 * @Date 2021/4/27
 */
public class LC_938_RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        if(root.val < low) return rangeSumBST(root.right, low, high);
        if(root.val > high) return rangeSumBST(root.left, low, high);
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
