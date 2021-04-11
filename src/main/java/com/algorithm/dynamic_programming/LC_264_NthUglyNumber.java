package com.algorithm.dynamic_programming;
/***
 * @Description: 丑数2
 * @level mid
 * @author wtychn
 * @Date 2021/4/11
 */
public class LC_264_NthUglyNumber {
    public int nthUglyNumber(int n) {
        int[] uglyNums = new int[n];
        uglyNums[0] = 1;
        int two = 0, three = 0, five = 0;
        for (int i = 1; i < n; i++) {
            int cur = Math.min(2 * uglyNums[two], Math.min(3 * uglyNums[three], 5 * uglyNums[five]));
            uglyNums[i] = cur;
            if(cur == 2 * uglyNums[two]) two++;
            if(cur == 3 * uglyNums[three]) three++;
            if(cur == 5 * uglyNums[five]) five++;
        }
        return uglyNums[n - 1];
    }
}
