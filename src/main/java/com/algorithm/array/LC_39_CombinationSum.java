package com.algorithm.array;

import java.util.*;

/**
 * @program: AlgorithmTest
 * @description: lc39
 * @author: Mr.Wang
 * @create: 2020-08-21 11:57
 **/
public class LC_39_CombinationSum {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        if(candidates.length == 0) return resList;
        dfs(candidates, 0, candidates.length, target, new LinkedList<>());
        return resList;
    }

    private void dfs(int[] candidates, int begin, int len, int target, Deque<Integer> path) {
        // 由于进入更深层的时候，小于 0 的部分被剪枝，因此递归终止条件值只判断等于 0 的情况
        if (target == 0) {
            resList.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < len; i++) {
            // 重点理解这里剪枝，前提是候选数组已经有序，
            if (target - candidates[i] < 0) {
                break;
            }

            path.addLast(candidates[i]);
            dfs(candidates, i, len, target - candidates[i], path);
            path.removeLast();
        }
    }
}
