package com.algorithm.linklist;

/***
 * @Description: 彩带串分串
 * @level easy
 * @author wtychn
 * @Date 2021/8/22
 */
public class Tencent_822_1 {
    public ListNode[] solve (int m, ListNode a) {
        ListNode[] res = new ListNode[m];
        ListNode[] idx = new ListNode[m];
        ListNode cur = a;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = null;
            int colour = cur.val % m;
            if (res[colour] == null) {
                res[colour] = cur;
            } else {
                idx[colour].next = cur;
            }
            idx[colour] = cur;
            cur = next;
        }
        return res;
    }
}
