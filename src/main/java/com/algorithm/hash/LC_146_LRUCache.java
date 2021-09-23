package com.algorithm.hash;

import java.util.LinkedHashMap;
import java.util.Map;

/***
 * @Description: LRU 缓存机制
 * @level mid
 * @author wtychn
 * @Date 2021/9/23
 */
class LRUCache extends LinkedHashMap<Integer, Integer>{
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
