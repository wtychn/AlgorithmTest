package com.algorithm.tree;

import java.util.HashMap;
import java.util.Map;

public class Offer_7_BuildTree {
    Map<Integer, Integer> inorderMap = new HashMap<>();
    int[] preorderArr;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        preorderArr = preorder;
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }


    private TreeNode recur(int rootPreorderIndex, int inorderLeftIndex, int inorderRightIndex) {
        if (inorderLeftIndex > inorderRightIndex) {
            return null;
        }
        int rootVal = preorderArr[rootPreorderIndex];
        TreeNode root = new TreeNode(rootVal);
        int rootInorderIndex = inorderMap.get(rootVal);
        root.left = recur(rootPreorderIndex + 1,
                inorderLeftIndex, rootInorderIndex - 1);
        root.right = recur(rootPreorderIndex + rootInorderIndex - inorderLeftIndex + 1,
                rootInorderIndex + 1, inorderRightIndex);
        return root;
    }
}
