package com.algorithm.dynamic_programming;
/***
 * @Description: 不相交的线
 * @level mid
 * @author wtychn
 * @Date 2021/5/21
 */
public class LC_1035_MaxUncrossedLines {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        // dp数组含义是这一元素之前有几根连线
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = Math.max(dp[i - 1][j - 1] + 1, dp[i][j]);
                }
            }
        }
        return dp[nums1.length][nums2.length];
    }
}
