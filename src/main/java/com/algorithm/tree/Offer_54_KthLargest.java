package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: AlgorithmTest
 * @description: offer54
 * @author: Mr.Wang
 * @create: 2020-07-25 11:17
 **/
public class Offer_54_KthLargest {
    int res = 0, count = 0;
    public int kthLargest(TreeNode root, int k) {
        this.count = k;
        inOrder(root);
        return res;
    }

    private void inOrder(TreeNode root) {
        if(root == null || count == 0) return;
        inOrder(root.right);
        if (--count == 0) {
            res = root.val;
            return;
        }
        inOrder(root.left);
    }
}
