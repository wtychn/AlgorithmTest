package com.algorithm.array;

import java.util.Arrays;
/***
 * @Description: 可形成最大正方形的矩阵数目  
 * @level easy 
 * @author wtychn
 * @Date 2021/1/17
 */
public class LC_5653_CountGoodRectangles {
    public int countGoodRectangles(int[][] rectangles) {
        Arrays.sort(rectangles, (o1, o2) -> Math.min(o2[0], o2[1]) - Math.min(o1[0], o1[1]));
        int res = 1, maxLen = Math.min(rectangles[0][0],rectangles[0][1]);
        while (res < rectangles.length &&
                Math.min(rectangles[res][0], rectangles[res][1]) >= maxLen) {
            res++;
        }
        return res;
    }
}
