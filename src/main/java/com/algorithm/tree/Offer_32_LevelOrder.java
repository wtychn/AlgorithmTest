package com.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Offer_32_LevelOrder {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> tmp = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        tmp.add(root);
        while (!tmp.isEmpty()) {
            TreeNode node = tmp.poll();
            ans.add(node.val);
            if (node.left != null) tmp.add(node.left);
            if (node.right != null) tmp.add(node.right);
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
