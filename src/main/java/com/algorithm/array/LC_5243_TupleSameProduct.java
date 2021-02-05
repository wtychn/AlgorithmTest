package com.algorithm.array;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 同积元组  
 * @level mid 
 * @author wtychn
 * @Date 2021/1/17
 */
public class LC_5243_TupleSameProduct {
    public int tupleSameProduct(int[] nums) {
        int res = 0;
        Map<Long, Integer> product = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long num = (long) nums[i] * nums[j];
                if (product.containsKey(num)) {
                    product.put(num, product.get(num) + 1);
                } else {
                    product.put(num, 1);
                }
            }
        }
        for (Integer count : product.values()) {
            res += count * (count - 1) / 2;
        }
        return res * 8;
    }
}
