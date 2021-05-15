package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
/***
 * @Description: 叶子相似的树
 * @level easy
 * @author wtychn
 * @Date 2021/5/10
 */
public class LC_872_LeafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2 = new ArrayList<>();
        tree2List(tree1, root1);
        tree2List(tree2, root2);
        if(tree1.size() != tree2.size()) return false;
        for (int i = 0; i < tree1.size(); i++) {
            if(!tree1.get(i).equals(tree2.get(i)))
                return false;
        }
        return true;
    }

    private void tree2List(List<Integer> list, TreeNode root) {
        if(root == null) return;
        tree2List(list, root.left);
        if (root.left == null && root.right == null)
            list.add(root.val);
        tree2List(list, root.right);
    }
}
