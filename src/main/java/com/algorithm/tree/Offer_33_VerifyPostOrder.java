package com.algorithm.tree;

import java.util.Stack;

public class Offer_33_VerifyPostOrder {
    public boolean verifyPostorder_recur(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    boolean recur(int[] postorder, int i, int j) {
        if (i >= j) return true;
        int p = i;
        while (postorder[p] < postorder[j]) p++;
        int m = p;
        while (postorder[p] > postorder[j]) p++;
        //p==j说明[m,j)之间的元素都大于postorder[j] 即 右子树的值都大于根节点的值
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }

    // 单调栈
    public boolean verifyPoster_stack(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for(int i = postorder.length - 1; i >= 0; i--) {
            if(postorder[i] > root) return false;
            //每到左子树开始更改根节点值
            while(!stack.isEmpty() && stack.peek() > postorder[i])
                root = stack.pop();
            stack.add(postorder[i]);
        }
        return true;
    }
}
