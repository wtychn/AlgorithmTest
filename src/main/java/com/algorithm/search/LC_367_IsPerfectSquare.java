package com.algorithm.search;

/***
 * @Description: 有效的完全平方数
 * @level easy
 * @author wtychn
 * @Date 2021/11/5
 */
public class LC_367_IsPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        while (l <= r) {
            int m = l + (r - l) / 2;
            // 用除法避免溢出
            int squareRoot = num / m;
            if (num % m == 0 && squareRoot == m) {
                return true;
            } else {
                if (squareRoot > m) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return false;
    }
}
