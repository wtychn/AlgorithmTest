package com.algorithm.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Offer_7_BuildTreeTest {

    @Test
    public void buildTree() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Offer_7_BuildTree buildTree = new Offer_7_BuildTree();
        TreeNode root = buildTree.buildTree(preorder, inorder);

        assertArrayEquals(preorder,root.preorderInt());
        assertArrayEquals(inorder,root.inorderInt());
    }
}