package com.algorithm.dynamic_programming;

public class Offer_14_1_CuttingTheRope {
    public int cuttingRope(int n) {
        int[] dp = {0, 1, 1};

        for (int i = 3; i <= n; i++) {
            dp[i % 3] = max(Math.max(i - 1, dp[(i - 1) % 3]),
                     2 * Math.max(i - 2, dp[(i - 2) % 3]),
                     3 * Math.max(i - 3, dp[(i - 3) % 3]));
        }

        return dp[n % 3];
    }

    private int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
