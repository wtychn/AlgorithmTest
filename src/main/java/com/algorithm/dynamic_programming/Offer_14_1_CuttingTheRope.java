package com.algorithm.dynamic_programming;

public class Offer_14_1_CuttingTheRope {
    public int cuttingRopeByDP(int n) {
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

    public int cuttingRopeByMath(int n) {
        if (n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        if (b == 0) return (int) Math.pow(3, a);
        if (b == 1) return (int) Math.pow(3, a - 1) * 4;
        return (int) Math.pow(3, a) * 2;
    }
}
