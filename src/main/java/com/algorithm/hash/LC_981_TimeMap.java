package com.algorithm.hash;

import java.util.*;

/***
 * @Description: 基于时间的键值存储
 * @level mid
 * @author wtychn
 * @Date 2021/7/10
 */
public class LC_981_TimeMap {
    class Value {
        int timestamp;
        String val;

        public Value(String val, int timestamp) {
            this.val = val;
            this.timestamp = timestamp;
        }
    }
    Map<String, List<Value>> map;
    /** Initialize your data structure here. */
    public LC_981_TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        Value val = new Value(value, timestamp);
        if (map.containsKey(key)) {
            map.get(key).add(val);
        } else {
            List<Value> list = new ArrayList<>();
            list.add(val);
            map.put(key, list);
        }
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Value> list = map.get(key);
        int l = 0, r = list.size() - 1;
        while (l < r) {
            // 这里的 +1 是为了防止 r - l = 1 时陷入死循环
            int m = l + (r - l + 1) / 2;
            int mTime = list.get(m).timestamp;
            if (mTime > timestamp) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if(l == 0 && list.get(0).timestamp > timestamp) return "";
        else return list.get(l - 1).val;
    }
}
