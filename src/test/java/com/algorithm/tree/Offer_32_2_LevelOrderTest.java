package com.algorithm.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_32_2_LevelOrderTest {

    @Test
    public void levelOrder() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Offer_7_BuildTree buildTree = new Offer_7_BuildTree();
        TreeNode root = buildTree.buildTree(preorder, inorder);

        Offer_32_2_LevelOrder levelOrder2 = new Offer_32_2_LevelOrder();
        System.out.println(levelOrder2.levelOrder(root));
    }
}