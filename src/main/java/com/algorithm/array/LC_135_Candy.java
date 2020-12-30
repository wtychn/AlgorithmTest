package com.algorithm.array;
/***
 * @Description: 分发糖果  
 * @level hard 
 * @author wtychn
 * @Date 2020/12/24
 */
public class LC_135_Candy {
    public int candy(int[] ratings) {
        int[] left = new int[ratings.length];
        left[0] = 1;
        int[] right = new int[ratings.length];
        right[right.length - 1] = 1;
        for (int i = 1; i < left.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        int res = left[left.length - 1];
        for (int i = right.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
            res += Math.max(right[i], left[i]);
        }
        return res;
    }
}
