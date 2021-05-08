package com.algorithm.search;
/***
 * @Description: 完成所有工作的最短时间
 * @level hard
 * @author wtychn
 * @Date 2021/5/8
 */
public class LC_1723_MinimumTimeRequired {
    int k;
    int res = Integer.MAX_VALUE;
    int[] jobs;

    public int minimumTimeRequired(int[] jobs, int k) {
        this.k = k;
        this.jobs = jobs;
        dfs(0, 0, new int[k], 0);
        return res;
    }

    private void dfs(int jobIdx, int used, int[] workerLoad, int max) {
        if(max >= res) return;
        if (jobIdx == jobs.length) {
            res = max;
            return;
        }
        if (used < k) {
            workerLoad[used] = jobs[jobIdx];
            dfs(jobIdx + 1, used + 1, workerLoad, Math.max(max, workerLoad[used]));
            workerLoad[used] = 0;
        }
        for (int i = 0; i < used; i++) {
            workerLoad[i] += jobs[jobIdx];
            dfs(jobIdx + 1, used, workerLoad, Math.max(max, workerLoad[i]));
            workerLoad[i] -= jobs[jobIdx];
        }
    }
}
