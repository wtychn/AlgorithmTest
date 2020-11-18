package com.algorithm.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_37_SerializeTest {

    @Test
    public void serialize() {
        TestTree treeFactory = new TestTree();
        TreeNode root = treeFactory.buildTree();

        Offer_37_Serialize instance = new Offer_37_Serialize();
        System.out.println(instance.serialize(root));
    }
}