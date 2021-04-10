package com.algorithm.queue;

import java.util.PriorityQueue;
/***
 * @Description: 蓄水
 * @level (not)easy
 * @author wtychn
 * @Date 2021/4/10
 */
public class LCPGroup_1_StoreWater {

    public int storeWater(int[] bucket, int[] vat) {
        int n = bucket.length;
        // 排序逻辑由 b[0]/b[1] - a[0]/a[1] 转化而来
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] * a[1] - b[1] * a[0]);
        int base = 0;
        boolean isZero = true;
        for (int i = 0; i < n; i++) {
            if (bucket[i] == 0 && vat[i] != 0) {
                base++;
                bucket[i] = 1;
            }
            if (vat[i] != 0) {
                isZero = false;
                pq.offer(new int[]{vat[i], bucket[i]});
            }
        }
        if (isZero) return 0;
        int res = cal(pq.peek());
        int inc = 0;
        while (pq.peek()[0] >= pq.peek()[1]) {
            inc++;
            int[] curr = pq.poll();
            pq.offer(new int[]{curr[0], curr[1] + 1});
            int val = inc + cal(pq.peek());
            res = Math.min(res, val);
        }
        return res + base;
    }

    public int cal(int[] curr) {
        int res = curr[0] / curr[1];
        if (curr[0] % curr[1] != 0) res++;
        return res;
    }

}
