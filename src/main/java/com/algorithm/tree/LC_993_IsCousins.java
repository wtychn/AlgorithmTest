package com.algorithm.tree;
/***
 * @Description: 二叉树的堂兄弟结点
 * @level easy
 * @author wtychn
 * @Date 2021/5/17
 */
public class LC_993_IsCousins {
    int x, y;
    int xParent = 0,xDepth = 0,yParent = 0, yDepth = 0;

    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        inOrder(root, 0, 0);
        return xParent != yParent && xDepth == yDepth;
    }

    private void inOrder(TreeNode node, int parent, int depth) {
        if(node == null) return;
        if (node.val == x) {
            xParent = parent;
            xDepth = depth;
        }
        if (node.val == y) {
            yParent = parent;
            yDepth = depth;
        }
        if (xParent != 0 && xDepth != 0 && yParent != 0 && yDepth != 0)
            return;
        inOrder(node.left, node.val, depth + 1);
        inOrder(node.right, node.val, depth + 1);
    }
}
