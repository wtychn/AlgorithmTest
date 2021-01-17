package com.algorithm.array;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.List;
/***
 * @Description: 汇总区间  
 * @level easy 
 * @author wtychn
 * @Date 2021/1/10
 */
public class LC_228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0) return res;
        int start = nums[0], end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                String part = start == end ? start + "" : start + "->" + end;
                res.add(part);
                start = nums[i];
            }
            end = nums[i];
        }
        String part = start == end ? start + "" : start + "->" + end;
        res.add(part);
        return res;
    }
}
