package com.algorithm.tree;

public class TestTree {
    public TreeNode buildTree() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Offer_7_BuildTree buildTree = new Offer_7_BuildTree();
        return buildTree.buildTree(preorder, inorder);
    }
}
