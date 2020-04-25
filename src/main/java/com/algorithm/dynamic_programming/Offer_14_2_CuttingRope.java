package com.algorithm.dynamic_programming;

public class Offer_14_2_CuttingRope {
    public int cuttingRope2(int n) {
        if (n <= 3) return n - 1;
        int r = n % 3, m = 1000000007;
        long rem = 1, x = 3;
        for (int a = n / 3; a > 0; a /= 2) {
            if (a % 2 == 1) {
                rem = (rem * x) % m;
            }
            x = (x * x) % m;
        }
        if (r == 0) return (int) (rem * 3 % m);
        if (r == 1) return (int) (rem * 4 % m);
        return (int) (rem * 6 % m);
    }
}
