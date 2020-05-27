package com.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offer_32_2_LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> tmp = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) tmp.add(root);
        while (!tmp.isEmpty()) {
            List<Integer> ans = new ArrayList<>();
            //与32题不同，这里使用for循环，锁定queue的poll次数
            //采用递减的理由：锁定queue的poll次数，否则运行一轮queue.size就会发生变化
            for (int i = tmp.size(); i > 0; i--) {
                TreeNode node = tmp.poll();
                ans.add(node.val);
                if (node.left != null) tmp.add(node.left);
                if (node.right != null) tmp.add(node.right);
            }
            res.add(ans);
        }
        return res;
    }
}
