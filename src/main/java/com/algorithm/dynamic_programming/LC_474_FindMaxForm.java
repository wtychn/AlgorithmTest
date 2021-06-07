package com.algorithm.dynamic_programming;
/***
 * @Description: 一和零
 * @level mid
 * @author wtychn
 * @Date 2021/6/6
 */
public class LC_474_FindMaxForm {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int ones = oneCount(s);
            int zeros = s.length() - ones;
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
                }
            }
        }
        return dp[m][n];
    }

    private int oneCount(String str) {
        int cnt = 0;
        for (char c : str.toCharArray()) {
            cnt += c - '0';
        }
        return cnt;
    }
}
