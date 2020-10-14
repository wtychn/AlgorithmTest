package com.algorithm.tree;

/**
 * @program: AlgorithmTest
 * @description: lc109
 * @author: Mr.Wang
 * @create: 2020-08-18 15:40
 **/
public class LC_109_SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return new TreeNode(head.val);

        ListNode low = head, fast = head, pre = null;
        while (fast != null && fast.next != null) {
            pre = low;
            low = low.next;
            fast = fast.next.next;
        }
        //打断链表，使得后面可以直接在函数中放进head
        pre.next = null;

        TreeNode root = new TreeNode(low.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(low.next);
        return root;
    }
}
