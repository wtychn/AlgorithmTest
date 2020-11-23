package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;
/***
 * @Description: 设计有序流
 * @level easy
 * @author wtychn
 * @Date 2020/11/15
 */
public class LC_5601_OrderedStream {
    String[] map;
    int ptr;
    public LC_5601_OrderedStream(int n) {
        map = new String[n + 1];
        ptr = 1;
    }

    public List<String> insert(int id, String value) {
        map[id] = value;
        List<String> res = new ArrayList<>();
        if (id == ptr) {
            while (id < map.length && map[id] != null) {
                res.add(map[id]);
                ptr = id + 1;
                id++;
            }
        }
        return res;
    }
}
