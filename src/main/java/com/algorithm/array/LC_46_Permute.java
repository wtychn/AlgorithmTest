package com.algorithm.array;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/***
 * @Description: 全排列
 * @level mid
 * @author wtychn
 * @Date 2020/11/18
 */
public class LC_46_Permute {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        dfs(new LinkedList<Integer>(), new boolean[nums.length], nums);
        return res;
    }

    private void dfs(Deque<Integer> tmp, boolean[] isUsed, int[] nums) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (isUsed[i]) continue;
                isUsed[i] = true;
                tmp.add(nums[i]);
                dfs(tmp, isUsed, nums);
                tmp.removeLast();
                isUsed[i] = false;
            }
        }
    }
}
