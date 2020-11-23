package com.algorithm.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/***
 * @Description: 根据身高重建队列
 * @level mid
 * @author wtychn
 * @Date 2020/11/16
 */
public class LC_406_ReconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        List<int[]> list = new LinkedList<>();
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(people);
    }
}
