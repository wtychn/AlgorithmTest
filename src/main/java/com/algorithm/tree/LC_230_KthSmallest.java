package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/***
 * @Description: 二叉搜索树中第 k 小的元素
 * @level mid
 * @author wtychn
 * @Date 2021/10/17
 */
public class LC_230_KthSmallest {
    List<Integer> nodes;

    public int kthSmallest(TreeNode root, int k) {
        nodes = new ArrayList<>();
        recur(root, k);
        return nodes.get(k - 1);
    }

    private void recur(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        recur(node.left, k);
        nodes.add(node.val);
        if (nodes.size() == k) {
            return;
        }
        recur(node.right, k);
    }
}
