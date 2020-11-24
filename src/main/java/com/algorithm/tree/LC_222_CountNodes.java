package com.algorithm.tree;
/***
 * @Description: 完全二叉树节点的个数
 * @level mid
 * @author wtychn
 * @Date 2020/11/24
 */
public class LC_222_CountNodes {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int left = countHeight(root.left);
        int right = countHeight(root.right);
        if (left == right) {
            return countNodes(root.right) + (1 << left);  // 位运算表示 1 * 2 ^ left (左子树加上根节点节点个数)
        } else {
            return countNodes(root.left) + (1 << right);  // 位运算表示 1 * 2 ^ right (右子树加上根节点节点个数)
        }
    }

    private int countHeight(TreeNode node) {
        int res = 0;
        while (node != null) {
            res++;
            node = node.left;
        }
        return res;
    }
}
