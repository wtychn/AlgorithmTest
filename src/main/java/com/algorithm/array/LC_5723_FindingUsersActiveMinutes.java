package com.algorithm.array;

import java.util.Arrays;
/***
 * @Description: 查找用户活跃分钟数  
 * @level mid 
 * @author wtychn
 * @Date 2021/4/4
 */
public class LC_5723_FindingUsersActiveMinutes {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] res = new int[k];
        Arrays.sort(logs, (o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            else return o1[0] - o2[0];
        });
        int count = 1, left = 0, right = 0;
        while (right <= logs.length) {
            if (right == logs.length || logs[right][0] != logs[left][0]) {
                res[count - 1]++;
                count = 1;
                left = right;
            } else if (left != right && logs[right][1] != logs[right - 1][1]) {
                count++;
            }
            right++;
        }
        return res;
    }
}
