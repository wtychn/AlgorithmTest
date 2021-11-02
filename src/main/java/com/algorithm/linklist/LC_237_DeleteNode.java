package com.algorithm.linklist;

/***
 * @Description: 删除链表中的节点(无法获得头节点)
 * @level easy
 * @author wtychn
 * @Date 2021/11/2
 */
public class LC_237_DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
