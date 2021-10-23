package com.algorithm.math;
/***
 * @Description: 构造矩形
 * @level easy
 * @author wtychn
 * @Date 2021/10/23
 */
public class LC_492_ConstructRectangle {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            --w;
        }
        return new int[]{area / w, w};
    }
}
