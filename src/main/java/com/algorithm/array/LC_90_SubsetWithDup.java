package com.algorithm.array;

import java.util.*;
/***
 * @Description: 子集2  
 * @level mid 
 * @author wtychn
 * @Date 2021/3/31
 */
public class LC_90_SubsetWithDup {
    List<Integer> t = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(false, 0, nums);
        return ans;
    }

    public void dfs(boolean choosePre, int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<>(t));
            return;
        }
        // 当前位置不选，直接进入下一位
        dfs(false, cur + 1, nums);
        // 上一位置没选且当前位与上一位相同，则跳过，即不选时跳过所有相同数字
        if (!choosePre && cur > 0 && nums[cur - 1] == nums[cur]) return;
        // 选择当前位置并回溯
        t.add(nums[cur]);
        dfs(true, cur + 1, nums);
        t.remove(t.size() - 1);
    }

}
