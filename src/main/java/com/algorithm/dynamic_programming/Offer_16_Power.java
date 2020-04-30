package com.algorithm.dynamic_programming;

public class Offer_16_Power {
    public double myPow(double x, int n) {
        if(x == 0) return 0;

        double result = 1;
        long i = n;

        if (i < 0) {
            x = 1 / x;
            i = -i;
        }

        while (i > 0) {
            if (i % 2 == 1) {
                result *= x;
            }
            x *= x;
            i /= 2;
        }

        return result;
    }
}
