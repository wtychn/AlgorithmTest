package com.algorithm.tree;

import java.util.HashMap;
import java.util.Map;

/***
 * @Description: 从前序与中序遍历序列构造二叉树
 * @level mid
 * @author wtychn
 * @Date 2021/10/16
 */
public class LC_105_BuildTree {
    Map<Integer, Integer> inorderMap;
    int[] preorder, inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        this.inorder = inorder;
        this.preorder = preorder;
        int right = preorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return recur(0, right, 0, right);
    }

    private TreeNode recur(int preLeft, int preRight, int inLeft, int inRight) {
        if (preRight - preLeft < 0 || inRight - inLeft < 0) {
            return null;
        }
        int preHead = preorder[preLeft];
        int inHeadIdx = inorderMap.get(preHead);
        TreeNode cur = new TreeNode(preHead);
        cur.left = recur(preLeft + 1, preLeft + inHeadIdx - inLeft, inLeft, inHeadIdx - 1);
        cur.right = recur(preLeft + inHeadIdx - inLeft + 1, preRight, inHeadIdx + 1, inRight);
        return cur;
    }
}
