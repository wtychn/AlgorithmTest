package com.algorithm.array;

import java.util.Arrays;
/***
 * @Description: 找第三大的数
 * @level easy
 * @author wtychn
 * @Date 2020/10/26
 */
public class LC_414_ThirdMax {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int index = 1;
        for(int j = nums.length - 1; j > 0; j--){
            if(nums[j] != nums[j-1]) {
                index++;
            }
            if(index == 3){
                return nums[j-1];
            }
        }
        return nums[nums.length-1];
    }
}
