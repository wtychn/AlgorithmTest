package com.algorithm.linklist;

import com.algorithm.tree.TreeNode;

/**
 * @program: AlgorithmTest
 * @description: lc876
 * @author: Mr.Wang
 * @create: 2020-08-18 17:12
 **/
public class LC_876_MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode low = head, fast = head;
        while (fast.next != null) {
            low = low.next;
            fast = fast.next.next;
        }
        return low;
    }
}
