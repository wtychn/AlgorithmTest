package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    public TreeNode(int _val,TreeNode _left,TreeNode _right) {
        val = _val;
        left = _left;
        right = _right;
    }

    public int[] preorderInt() {
        List<Integer> preorderList = new ArrayList<>();
        preorder(preorderList);
        int[] result = new int[preorderList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = preorderList.get(i);
        }
        return result;
    }

    public int[] inorderInt() {
        List<Integer> inorderList = new ArrayList<>();
        inorder(inorderList);
        int[] result = new int[inorderList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = inorderList.get(i);
        }
        return result;
    }

    private void preorder(List<Integer> preorderList) {
        preorderList.add(this.val);
        if (this.left != null) {
            this.left.preorder(preorderList);
        }
        if (this.right != null) {
            this.right.preorder(preorderList);
        }
    }

    private void inorder(List<Integer> inorderList) {
        if (this.left != null) {
            this.left.inorder(inorderList);
        }
        inorderList.add(this.val);
        if (this.right != null) {
            this.right.inorder(inorderList);
        }
    }
}

