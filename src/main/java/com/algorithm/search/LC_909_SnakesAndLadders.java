package com.algorithm.search;

import java.util.LinkedList;
import java.util.Queue;
/***
 * @Description: 蛇梯棋
 * @level mid
 * @author wtychn
 * @Date 2021/6/27
 */
public class LC_909_SnakesAndLadders {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] isVisit = new boolean[n * n + 1];
        Queue<int[]> queue = new LinkedList<>();
        // 数组中存储的是 [格子编号, 步数]
        queue.add(new int[]{1, 0});
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            for (int i = 1; i <= 6; i++) {
                int nextId = pos[0] + i;
                if(nextId > n * n) break;
                int[] rc = id2rc(nextId, n);
                // 遇到蛇梯
                if (board[rc[0]][rc[1]] > 0)
                    nextId = board[rc[0]][rc[1]];
                // 到达终点
                if(nextId == n * n) return pos[1] + 1;
                // 新分支
                if (!isVisit[nextId]) {
                    isVisit[nextId] = true;
                    queue.offer(new int[]{nextId, pos[1] + 1});
                }
            }
        }
        return -1;
    }

    public int[] id2rc(int id, int n) {
        int r = (id - 1) / n, c = (id - 1) % n;
        if (r % 2 == 1) {
            c = n - 1 - c;
        }
        return new int[]{n - 1 - r, c};
    }
}
