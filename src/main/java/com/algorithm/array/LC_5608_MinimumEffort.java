package com.algorithm.array;

import java.util.Arrays;
/***
 * @Description: 完成所有任务用到的最少能量
 * @level hard
 * @author wtychn
 * @Date 2020/11/22
 */
public class LC_5608_MinimumEffort {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        int p = 0;
        int sum = 0;
        for (int[] task: tasks) {
            p = Math.max(p, sum + task[1]);
            sum += task[0];
        }
        return p;
    }
}
