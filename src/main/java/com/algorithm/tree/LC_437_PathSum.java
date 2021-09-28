package com.algorithm.tree;

import java.util.HashMap;
import java.util.Map;

/***
 * @Description: 路径总和 3
 * @level mid
 * @author wtychn
 * @Date 2021/9/28
 */
public class LC_437_PathSum {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefix = new HashMap<>();
        prefix.put(0L, 1);
        return dfs(root, prefix, 0, targetSum);
    }

    private int dfs(TreeNode node, Map<Long, Integer> prefix, long curSum, int target) {
        if (node == null) {
            return 0;
        }

        curSum += node.val;

        int res = prefix.getOrDefault(curSum - target, 0);
        prefix.put(curSum, prefix.getOrDefault(curSum, 0) + 1);
        res += dfs(node.left, prefix, curSum, target);
        res += dfs(node.right, prefix, curSum, target);
        prefix.put(curSum, prefix.getOrDefault(curSum, 0) - 1);

        return res;
    }
}
