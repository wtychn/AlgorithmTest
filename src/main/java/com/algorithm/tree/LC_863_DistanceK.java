package com.algorithm.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * @Description: 二叉树中所有距离为 k 的结点
 * @level mid
 * @author wtychn
 * @Date 2021/7/28
 */
public class LC_863_DistanceK {
    Map<Integer, TreeNode> parents = new HashMap<>();
    List<Integer> ans = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // 从 root 出发 DFS，记录每个结点的父结点
        findParents(root);
        // 从 target 出发 DFS，寻找所有深度为 k 的结点
        findAns(target, null, 0, k);

        return ans;
    }

    public void findParents(TreeNode node) {
        if (node.left != null) {
            parents.put(node.left.val, node);
            findParents(node.left);
        }
        if (node.right != null) {
            parents.put(node.right.val, node);
            findParents(node.right);
        }
    }

    public void findAns(TreeNode node, TreeNode from, int depth, int k) {
        if(node == null) return;
        if (depth == k) {
            ans.add(node.val);
            return;
        }
        if(node.left != from) findAns(node.left, node, depth + 1, k);
        if(node.right != from) findAns(node.right, node, depth + 1, k);
        if (parents.get(node.val) != from)
            findAns(parents.get(node.val), node, depth + 1, k);
    }
}