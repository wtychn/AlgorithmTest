package com.algorithm.tree;
/***
 * @Description: 求所有根到叶子节点组成的数字之和
 * @level mid
 * @author wtychn
 * @Date 2020/10/29
 */
public class LC_129_SumNumbers {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        if(root != null) recur(root, 0);
        return sum;
    }

    private void recur(TreeNode node, int num) {
        num = num * 10 + node.val;
        if (node.left == null && node.right == null) sum += num;
        if (node.left != null) recur(node.left, num);
        if (node.right != null) recur(node.right, num);
    }
}
