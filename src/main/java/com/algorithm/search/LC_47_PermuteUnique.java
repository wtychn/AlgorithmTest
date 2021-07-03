package com.algorithm.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/***
 * @Description: 全排列2
 * @level mid
 * @author wtychn
 * @Date 2021/6/22
 */
public class LC_47_PermuteUnique {
    List<List<Integer>> res;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        // 排序是去重的前提
        Arrays.sort(nums);
        backtrack(new boolean[nums.length], nums, new ArrayList<>());
        return res;
    }

    private void backtrack(boolean[] isVisited, int[] nums, List<Integer> cur) {
        if (cur.size() == nums.length) {
            // 新建 list 加入结果，不然结果为空
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(isVisited[i] || (i > 0 && nums[i] == nums[i - 1] && !isVisited[i - 1]))
                continue;

            isVisited[i] = true;
            cur.add(nums[i]);
            backtrack(isVisited, nums, cur);
            cur.remove(cur.size() - 1);
            isVisited[i] = false;
        }
    }
}
