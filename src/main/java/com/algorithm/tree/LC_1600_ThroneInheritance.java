package com.algorithm.tree;

import java.util.*;
/***
 * @Description: 皇位继承顺序
 * @level mid
 * @author wtychn
 * @Date 2021/6/20
 */
public class LC_1600_ThroneInheritance {
    class Node {
        String name;
        boolean isDead = false;
        List<Node> children = new ArrayList<>();

        Node(String name) {
            this.name = name;
        }
    }

    Map<String, Node> map = new HashMap<>();
    Node root = null;
    public LC_1600_ThroneInheritance(String kingName) {
        root = new Node(kingName);
        map.put(kingName, root);
    }

    public void birth(String parentName, String childName) {
        Node parent = map.get(parentName);
        Node child = new Node(childName);
        parent.children.add(child);
        map.put(childName, child);
    }

    public void death(String name) {
        map.get(name).isDead = true;
    }

    public List<String> getInheritanceOrder() {
        List<String> res = new ArrayList<>();
        preorder(res, root);
        return res;
    }

    private void preorder(List<String> res, Node node) {
        if (!node.isDead) res.add(node.name);
        for (Node child : node.children) {
            preorder(res, child);
        }
    }
}
