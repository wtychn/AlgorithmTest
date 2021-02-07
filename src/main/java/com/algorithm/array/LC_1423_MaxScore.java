package com.algorithm.array;

import java.util.Arrays;
/***
 * @Description: 可获得的最大点数  
 * @level mid 
 * @author wtychn
 * @Date 2021/2/7
 */
public class LC_1423_MaxScore {
    public int maxScore(int[] cardPoints, int k) {
        int curSum = 0, left = 0;
        for (int i = 0; i < cardPoints.length - k; i++) {
            curSum += cardPoints[i];
        }
        int min = curSum;
        for (int i = cardPoints.length - k; i < cardPoints.length; i++) {
            curSum += cardPoints[i] - cardPoints[left++];
            min = Math.min(min, curSum);
        }
        return Arrays.stream(cardPoints).sum() - min;
    }
}
