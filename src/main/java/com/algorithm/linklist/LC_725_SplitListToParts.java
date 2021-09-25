package com.algorithm.linklist;

/***
 * @Description: 分隔链表
 * @level mid
 * @author wtychn
 * @Date 2021/9/22
 */
public class LC_725_SplitListToParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        if (head == null) {
            return res;
        }

        int n = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            n++;
        }
        int quotient = n / k, remainder = n % k;

        cur = head;
        for (int i = 0; i < k && cur != null; i++) {
            res[i] = cur;
            int size = i < remainder ? quotient + 1 : quotient;
            for (int j = 1; j < size; j++) {
                cur = cur.next;
            }
            ListNode next = cur.next;
            cur.next = null;
            cur = next;
        }
        return res;
    }
}
