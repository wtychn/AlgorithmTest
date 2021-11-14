package com.algorithm.prefix;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wtychn
 * @Description: 键值映射
 * @level mid
 * @Date 2021/11/14
 */
class MapSum {
    class TrimNode {
        int val = 0;
        TrimNode[] next = new TrimNode[26];
    }

    TrimNode root;
    Map<String, Integer> map;

    public MapSum() {
        map = new HashMap<>();
        root = new TrimNode();
    }

    public void insert(String key, int val) {
        int diff = val - map.getOrDefault(key, 0);
        map.put(key, val);
        TrimNode curNode = root;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int idx = c - 'a';
            if (curNode.next[idx] == null) {
                curNode.next[idx] = new TrimNode();
            }
            curNode = curNode.next[idx];
            curNode.val += diff;
        }
    }

    public int sum(String prefix) {
        TrimNode curNode = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int idx = c - 'a';
            if (curNode.next[idx] == null) {
                return 0;
            }
            curNode = curNode.next[idx];
        }
        return curNode.val;
    }
}
