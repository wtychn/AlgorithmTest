package com.algorithm.sort;

import java.util.*;
/***
 * @Description: 矩阵中战斗力最弱的 K 行
 * @level easy
 * @author wtychn
 * @Date 2021/8/1
 */
public class LC_1337_kWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });
        int n = mat[0].length;
        for (int i = 0; i < mat.length; i++) {
            int[] pair = new int[2];
            // 二分查找得到和
            int l = 0, r = n - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                int mNum = mat[i][m];
                if (mNum == 1) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            pair[0] = l;
            pair[1] = i;
            pq.add(pair);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll()[1];
        }
        return res;
    }

    public int[] kWeakestRows_2(int[][] mat, int k) {
        Set<Integer> isVisited = new HashSet<>();
        int[] res = new int[k];
        int idx = 0;
        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                if (!isVisited.contains(i) && mat[i][j] == 0) {
                    res[idx++] = i;
                    isVisited.add(i);
                    if(idx >= k) return res;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            if (!isVisited.contains(i)) {
                res[idx++] = i;
                if(idx >= k) return res;
            }
        }
        return res;
    }
}
