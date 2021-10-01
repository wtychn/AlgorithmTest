package com.algorithm.hash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * @Description: 旅行终点站
 * @level easy
 * @author wtychn
 * @Date 2021/10/1
 */
public class LC_1436_DestCity {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        String key = paths.get(0).get(0);
        String next;
        while (map.size() > 0) {
            next = map.get(key);
            if (next == null) {
                break;
            }
            map.remove(key);
            key = next;
        }
        return key;
    }
}
