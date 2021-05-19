package com.algorithm.array;
/***
 * @Description: 找出所有子集的异或总和再求和
 * @level easy
 * @author wtychn
 * @Date 2021/5/16
 */
public class LC_5759_SubsetXORSum {
    int res;
    int[] nums;

    public int subsetXORSum(int[] nums) {
        res = 0;
        this.nums = nums;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int length = 1; length <= n - i; length++) {
                dfs(i, 0, 0, length);
            }
        }
        return res;
    }

    private void dfs(int idx, int cur, int curLen, int length) {
        cur ^= nums[idx];
        curLen++;
        if (curLen == length) {
            res += cur;
            return;
        }
        for (int i = idx + 1; i < nums.length; i++) {
            dfs(i, cur, curLen, length);
        }
    }
}
