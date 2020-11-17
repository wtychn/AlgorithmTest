package com.algorithm.array;

import java.util.Arrays;
import java.util.Comparator;

public class LC_1030_AllCellsDistOrder {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R * C][2];
        int count = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                res[count++] = new int[]{i, j};
            }
        }
        Arrays.sort(res, (o1, o2) -> {
            int d1 = Math.abs(o1[0] - r0) + Math.abs(o1[1] - c0);
            int d2 = Math.abs(o2[0] - r0) + Math.abs(o2[1] - c0);
            return d1 - d2;
        });
        return res;
    }

    public int[][] allCellsDistOrder_bfs(int R, int C, int r0, int c0) {
        int[][] re = new int[R * C][2];
        re[0][0] = r0;
        re[0][1] = c0;
        // 从正方形最上面的点开始顺时针找点
        int[] dr = {1, 1, -1, -1};
        int[] dc = {1, -1, -1, 1};
        int row = r0;
        int col = c0;
        int cnt = 1;
        while (cnt < R * C) {
            row--;
            for (int i = 0; i < 4; i++) {
                while ((i % 2 == 0 && row != r0) || (i % 2 != 0 && col != c0)) {
                    if (row >= 0 && row < R && col >= 0 && col < C) {
                        re[cnt][0] = row;
                        re[cnt][1] = col;
                        cnt++;
                    }
                    row += dr[i];
                    col += dc[i];
                }
            }
        }
        return re;
    }
}
