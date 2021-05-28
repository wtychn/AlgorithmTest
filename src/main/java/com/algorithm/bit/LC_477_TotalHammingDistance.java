package com.algorithm.bit;
/***
 * @Description: 汉明距离总和
 * @level mid
 * @author wtychn
 * @Date 2021/5/28
 */
public class LC_477_TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int count = 0, n = nums.length;
        for (int i = 0; i < 30; i++) {
            int oneCnt = 0;
            for (int num : nums)
                oneCnt += (num >> i) & 1;
            count += oneCnt * (n - oneCnt);
        }
        return count;
    }
}
