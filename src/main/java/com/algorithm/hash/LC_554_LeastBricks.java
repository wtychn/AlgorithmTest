package com.algorithm.hash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/***
 * @Description: 砖墙
 * @level mid
 * @author wtychn
 * @Date 2021/5/3
 */
public class LC_554_LeastBricks {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (List<Integer> bricks : wall) {
            int length = 0;
            for (int i = 0; i < bricks.size() - 1; i++) {
                int brick = bricks.get(i);
                length += brick;
                map.put(length, map.getOrDefault(length, 0) + 1);
                max = Math.max(max, map.get(length));
            }
        }
        return wall.size() - max;
    }
}
