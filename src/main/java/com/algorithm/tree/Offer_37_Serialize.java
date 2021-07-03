package com.algorithm.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Offer_37_Serialize {
    /**
     * 广度优先搜索
     */
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "[]";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder result=new StringBuilder();
        result.append("[");

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                result.append(node.val).append(",");
                queue.add(node.left);
                queue.add(node.right);
            } else {
                result.append("null,");
            }
        }
        result.deleteCharAt(result.length() - 1);
        result.append("]");
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) return null;
        String[] values = data.substring(1, data.length() - 1).split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (!values[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(values[i]));
                queue.add(node.left);
            }
            i++;
            if (!values[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(values[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }

//    ==================================================================
    /**
     * 深度优先搜索
     */
    StringBuilder sb = new StringBuilder();
    // Encodes a tree to a single string.
    public String serialize_2(TreeNode root) {
        dfs(root);
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            sb.append("null").append(",");
            return;
        }
        sb.append(root.val).append(",");
        dfs(root.left);
        dfs(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize_2(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return dfs(queue);
    }

    private TreeNode dfs(Queue<String> queue) {
        String cur = queue.poll();
        if(cur.equals("null")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(cur));
        node.left = dfs(queue);
        node.right = dfs(queue);
        return node;
    }
}
