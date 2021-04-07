package com.algorithm.array;

import java.util.Arrays;
/***
 * @Description: 采购方案  
 * @level easy 
 * @author wtychn
 * @Date 2021/4/5
 */
public class LCSpring_1_PurchasePlans {
    public int purchasePlans(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] + nums[i + 1] > target) break;
            // 二分查找
            int l = i + 1, r = nums.length - 1;
            while (l <= r) {
                int m = (l + r) / 2;
                if (nums[m] + nums[i] > target) {
                    r = m - 1;
                } else {
                    if (m >= nums.length - 1 || nums[m + 1] + nums[i] > target) {
                        count = (count + m - i) % 1000000007;
                        break;
                    } else {
                        l = m + 1;
                    }
                }
            }
        }
        return count % 1000000007;
    }

    public int purchasePlans_doublePointers(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        int res = 0;
        while (l < r) {
            if (nums[l] + nums[r] <= target) {
                res += r - l;
                l++;
            } else {
                r--;
            }
            res %= 1000000007;
        }
        return res % 1000000007;
    }
}
