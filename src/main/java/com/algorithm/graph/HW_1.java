package com.algorithm.graph;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 根据名字进行分组  
 * @level mid 
 * @author wtychn
 * @Date 2021/4/8
 */
public class HW_1 {
    public int groupCount(String[][] names) {
        UnionFind uf = new UnionFind();
        for (String[] name : names) {
            uf.add(name[0]);
            uf.add(name[1]);
            uf.merge(name[0], name[1]);
        }
        return uf.getNumOfSets();
    }
}

class UnionFind {
    // 记录父节点
    private Map<String, String> father;
    // 记录集合的数量
    private int numOfSets = 0;

    public UnionFind() {
        father = new HashMap<>();
        numOfSets = 0;
    }

    public void add(String x) {
        if (!father.containsKey(x)) {
            father.put(x, null);
            numOfSets++;
        }
    }

    public void merge(String x, String y) {
        String rootX = find(x);
        String rootY = find(y);

        if (!rootX.equals(rootY)) {
            father.put(rootX, rootY);
            numOfSets--;
        }
    }

    public String find(String x) {
        String root = x;

        while (father.get(root) != null) {
            root = father.get(root);
        }

        while (!x.equals(root)) {
            String original_father = father.get(x);
            father.put(x, root);
            x = original_father;
        }

        return root;
    }

    public boolean isConnected(String x, String y) {
        return find(x).equals(find(y));
    }

    public int getNumOfSets() {
        return numOfSets;
    }
}