package com.algorithm.array;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 存在重复元素3
 * @level mid
 * @author wtychn
 * @Date 2021/4/17
 */
public class LC_220_ContainsNearbyAlmostDuplicate {
    long size;
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        Map<Long, Long> map = new HashMap<>();
        size = t + 1L;
        for (int i = 0; i < n; i++) {
            long num = nums[i];
            long idx = getIdx(num);
            // 目标桶已存在（桶不为空），说明前面已有 [u - t, u + t] 范围的数字
            if (map.containsKey(idx)) return true;
            // 检查相邻的桶
            long l = idx - 1, r = idx + 1;
            if (map.containsKey(l) && Math.abs(num - map.get(l)) <= t) return true;
            if (map.containsKey(r) && Math.abs(num - map.get(r)) <= t) return true;
            // 建立目标桶
            map.put(idx, num);
            // 移除下标范围不在 [max(0, i - k), i) 内的桶
            if (i >= k) map.remove(getIdx(nums[i - k]));
        }
        return false;
    }
    long getIdx(long num) {
        return num >= 0 ? num / size : (num + 1) / size - 1;
    }
}
