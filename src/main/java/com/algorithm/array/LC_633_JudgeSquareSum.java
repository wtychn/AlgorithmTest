package com.algorithm.array;
/***
 * @Description: 平方数之和
 * @level mid
 * @author wtychn
 * @Date 2021/4/28
 */
public class LC_633_JudgeSquareSum {
    public boolean judgeSquareSum(int c) {
        int l = 0, r = (int) Math.sqrt(c);
        while (l <= r) {
            int sum = l * l + r * r;
            if(sum == c) return true;
            else if(sum < c) l++;
            else r--;
        }
        return false;
    }
}
