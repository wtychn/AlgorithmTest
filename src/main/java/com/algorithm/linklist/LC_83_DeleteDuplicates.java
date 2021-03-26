package com.algorithm.linklist;
/***
 * @Description: 删除链表中的重复元素  
 * @level easy 
 * @author wtychn
 * @Date 2021/3/26
 */
public class LC_83_DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode left = head, right = head;
        while (left != null) {
            if (right != null && right.val == left.val) {
                right = right.next;
            } else {
                left.next = right;
                left = right;
            }
        }
        return head;
    }
}
