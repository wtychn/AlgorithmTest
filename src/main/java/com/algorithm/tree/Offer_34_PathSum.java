package com.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer_34_PathSum {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }

    private void recur(TreeNode node,int tar) {
        if (node==null) return;
        path.add(node.val);
        tar -= node.val;
        if (tar == 0 && node.left == null && node.right == null) {
            res.add(new LinkedList<>(path));
        }
        recur(node.left, tar);
        recur(node.right, tar);
        path.removeLast();
    }
}
