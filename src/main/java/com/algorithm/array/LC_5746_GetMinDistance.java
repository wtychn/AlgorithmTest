package com.algorithm.array;
/***
 * @Description: 到目标元素的最小距离
 * @level easy
 * @author wtychn
 * @Date 2021/5/3
 */
public class LC_5746_GetMinDistance {
    public int getMinDistance(int[] nums, int target, int start) {
        int l = start, r = start;
        while (l >= 0 || r < nums.length) {
            int disL = Math.abs(l - start);
            int disR = Math.abs(r - start);
            if(l >= 0 && nums[l] == target) return disL;
            if(r < nums.length && nums[r] == target) return disR;
            l--;
            r++;
        }
        return 0;
    }
}
