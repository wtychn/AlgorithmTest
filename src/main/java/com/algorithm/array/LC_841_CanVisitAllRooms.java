package com.algorithm.array;

import java.util.List;

/**
 * @program: AlgorithmTest
 * @description: lc841
 * @author: Mr.Wang
 * @create: 2020-08-31 11:35
 **/
public class LC_841_CanVisitAllRooms {
    boolean[] isVisited;
    int visitCount;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        isVisited = new boolean[rooms.size()];
        visitCount = 0;
        recur(rooms, 0);
        return visitCount == rooms.size();
    }

    private void recur(List<List<Integer>> rooms, int index) {
        if (isVisited[index]) {
            return;
        } else {
            isVisited[index] = true;
            visitCount++;
        }
        for (int key : rooms.get(index)) {
            recur(rooms, key);
        }
    }
}
