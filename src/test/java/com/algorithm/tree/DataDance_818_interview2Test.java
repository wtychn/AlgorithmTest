package com.algorithm.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataDance_818_interview2Test {

    DataDance_818_interview2 main;
    Map<DataDance_818_interview2.Node, DataDance_818_interview2.Node> nodeMap;

    @Before

    public void before() {
        main = new DataDance_818_interview2();
        nodeMap = new LinkedHashMap<>();
        DataDance_818_interview2.Node a1 = new DataDance_818_interview2.Node("a");
        DataDance_818_interview2.Node b1 = new DataDance_818_interview2.Node("b");
        DataDance_818_interview2.Node c1 = new DataDance_818_interview2.Node("c");
        DataDance_818_interview2.Node d1 = new DataDance_818_interview2.Node("d");
        DataDance_818_interview2.Node e1 = new DataDance_818_interview2.Node("e");
        a1.children.add(b1);
        a1.children.add(c1);
        c1.children.add(d1);
        c1.children.add(e1);
        nodeMap.put(c1, d1);
    }

    @Test
    public void isChild() {
        for (Map.Entry<DataDance_818_interview2.Node, DataDance_818_interview2.Node> entry : nodeMap.entrySet()) {
            DataDance_818_interview2.Node key = entry.getKey();
            DataDance_818_interview2.Node val = entry.getValue();
            System.out.println(main.isChild(key, val));
        }
    }
}