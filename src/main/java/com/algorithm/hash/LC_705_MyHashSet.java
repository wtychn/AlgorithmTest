package com.algorithm.hash;

import java.util.LinkedList;

public class LC_705_MyHashSet {

    private static final int BASE = 769;
    private final LinkedList[] data;

    /** Initialize your data structure here. */
    public LC_705_MyHashSet() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; ++i) {
            data[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {
        int h = hash(key);
        for (Integer integer : (Iterable<Integer>) data[h]) {
            if (integer == key) return;
        }
        data[h].add(key);
    }

    public void remove(int key) {
        int h = hash(key);
        for (Integer element : (Iterable<Integer>) data[h]) {
            if (element == key) {
                data[h].remove(element);
                return;
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int h = hash(key);
        for (Integer integer : (Iterable<Integer>) data[h]) {
            if (integer == key) return true;
        }
        return false;
    }

    private static int hash(int key) {
        return key % BASE;
    }

}
