package com.algorithm.tree;
/***
 * @Description: 数组中两个数的最大异或值
 * @level mid
 * @author wtychn
 * @Date 2021/5/16
 */
public class LC_421_FindMaximumXOR {
    class Node {
        Node[] nodes = new Node[2];
    }

    Node root = new Node();

    private void add(int num) {
        Node node = root;
        for (int i = 31; i >= 0; i--) {
            int a = (num >> i) & 1;
            if(node.nodes[a] == null) node.nodes[a] = new Node();
            node = node.nodes[a];
        }
    }

    private int getVal(int num) {
        Node node = root;
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            int a = (num >> i) & 1, b = 1 - a;
            if (node.nodes[b] != null) {
                res |= (b << i);
                node = node.nodes[b];
            } else {
                res |= (a << i);
                node = node.nodes[a];
            }
        }
        return res;
    }

    public int findMaximumXOR(int[] nums) {
        int res = 0;
        for (int i : nums) {
            add(i);
            int j = getVal(i);
            res = Math.max(res, i ^ j);
        }
        return res;
    }
}
