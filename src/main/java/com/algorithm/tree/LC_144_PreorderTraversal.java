package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
/***
 * @Description: 二叉树前序遍历
 * @level mid
 * @author wtychn
 * @Date 2020/10/27
 */
public class LC_144_PreorderTraversal {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        recur(root);
        return res;
    }

    private void recur(TreeNode node) {
        if (node == null) return;
        res.add(node.val);
        recur(node.left);
        recur(node.right);
    }
}
