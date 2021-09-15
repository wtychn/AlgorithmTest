package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/***
 * @Description: 判断是否是孩子节点
 * @level mid
 * @author wtychn
 * @Date 2021/8/18
 */
public class DataDance_818_interview2 {

    static class Node {
        String val;
        List<Node> children;

        public Node(String val) {
            this.val = val;
            children = new ArrayList<>();
        }
    }

    boolean flag = false;

    public boolean isChild(Node parent, Node child) {
        for (Node node : parent.children) {
            flag = node.equals(child) || isChild(node, child);
            if(flag) break;
        }
        return flag;
    }

}
