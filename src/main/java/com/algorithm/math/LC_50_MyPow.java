package com.algorithm.math;
/***
 * @Description: Pow(x, n)
 * @level mid
 * @author wtychn
 * @Date 2021/3/20
 */
public class LC_50_MyPow {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        double res = 1.0;
        /*
         * Java 代码中 int32 变量 n∈[−2147483648,2147483647],
         * 因此当 n = -2147483648 时执行 n = -n 会因越界而赋值出错。
         * 解决方法是先将 n 存入 long 变量 ln ，后面用 ln 操作即可。
         */
        long ln = n;
        if (ln < 0) {
            ln = -ln;
            x = 1 / x;
        }
        while (ln > 0) {
            if ((ln & 1) == 1) res *= x;
            x *= x;
            ln >>= 1;
        }
        return res;
    }

    public double myPow2(double x, int n) {
        if(x == 0) return 0;
        long ln = n;
        if (ln < 0) {
            ln = -ln;
            x = 1 / x;
        }
        return recur(x, ln);
    }

    private double recur(double x, long n) {
        if (n == 0) return 1.0;
        double sqrt = recur(x, n / 2);
        return n % 2 == 0 ? sqrt * sqrt : sqrt * sqrt * x;
    }
}
