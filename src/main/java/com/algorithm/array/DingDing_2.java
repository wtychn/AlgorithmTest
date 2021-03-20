package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;

 /***
  * @Description: 寻找数组中满足条件的最小值
  * @level
  * @author wtychn
  * @Date 2021/3/19
  */

public class DingDing_2 {
    int result = Integer.MAX_VALUE;
    int[] a, b;

    public int solution(int n, int[] a, int[] b) {
        if (n < 3) return -1;

        this.a = a;
        this.b = b;

        backTracking(0, new ArrayList<>());
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private void backTracking(int index, List<Integer> resList) {
        if (resList.size() == 3) {
            result = Math.min(result, b[resList.get(0)] + b[resList.get(1)] + b[resList.get(2)]);
            return;
        }

        for (int i = index; i < a.length; i++) {
            // 比前面的数小，剪枝
            if (resList.size() != 0 && a[i] < a[resList.get(resList.size() - 1)]) continue;
            resList.add(i);
            backTracking(i + 1, resList);
            resList.remove(resList.size() - 1);
        }
    }
}
