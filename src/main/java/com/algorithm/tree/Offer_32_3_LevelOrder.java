package com.algorithm.tree;

import java.util.*;

public class Offer_32_3_LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> tmp = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) tmp.add(root);
        while (!tmp.isEmpty()) {
            List<Integer> ans = new ArrayList<>();
            //打印奇数层
            for (int i = tmp.size(); i > 0; i--) {
                TreeNode node = tmp.removeFirst();
                ans.add(node.val);
                //从左向右加入队列
                if (node.left != null) tmp.addLast(node.left);
                if (node.right != null) tmp.addLast(node.right);
            }
            res.add(ans);
            if (tmp.isEmpty()) break;
            ans = new LinkedList<>();
            //打印偶数层
            for (int i = tmp.size(); i > 0; i--) {
                TreeNode node = tmp.removeLast();
                ans.add(node.val);
                //从右到左加入队列
                if (node.right != null) tmp.addFirst(node.right);
                if (node.left != null) tmp.addFirst(node.left);
            }
            res.add(ans);
        }
        return res;
    }
}
