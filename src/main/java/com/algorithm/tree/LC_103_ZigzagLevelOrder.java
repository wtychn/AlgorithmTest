package com.algorithm.tree;

import java.util.*;
/***
 * @Description: 二叉树锯齿形层序遍历  
 * @level mid 
 * @author wtychn
 * @Date 2020/12/22
 */
public class LC_103_ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        boolean isLeftStart = true;
        while (!nodeQueue.isEmpty()) {
            List<Integer> part = new ArrayList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode pollNode = nodeQueue.poll();
                if (pollNode != null) {
                    part.add(pollNode.val);
                    if(pollNode.left != null) nodeQueue.add(pollNode.left);
                    if(pollNode.right != null) nodeQueue.add(pollNode.right);
                }
            }
            if (!isLeftStart) {
                Collections.reverse(part);
            }
            res.add(part);
            isLeftStart = !isLeftStart;
        }
        return res;
    }
}
