package com.algorithm.array;
/***
 * @Description: 找出数组游戏的赢家
 * @level mid
 * @author wtychn
 * @Date 2021/7/29
 */
public class LC_1535_GetWinner {
    public int getWinner(int[] arr, int k) {
        int cur = Math.max(arr[0], arr[1]);
        if(k == 1) return cur;
        int max = cur;
        int freq = 1;
        for (int i = 2; i < arr.length; i++) {
            if (cur > arr[i]) {
                freq++;
                if (freq >= k) return cur;
            } else {
                cur = arr[i];
                freq = 1;
            }
            max = Math.max(cur, max);
        }
        return max;
    }
}
