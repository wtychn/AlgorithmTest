package com.algorithm.linklist;

import java.util.LinkedHashMap;
import java.util.Map;
/***
 * @Description: 牛牛的数链们
 * @level mid
 * @author wtychn
 * @Date 2021/9/5
 */
public class Tencent_9_5_1 {
    public ListNode solve(ListNode[] a) {
        ListNode head = null;
        int[] count = new int[a.length];
        for (ListNode node : a) {
            if (node != null) {
                head = node;
                break;
            }
        }
        if (head == null) return null;

        Map<Integer, ListNode> helpMap = new LinkedHashMap<>();
        Map<Integer, ListNode> headMap = new LinkedHashMap<>();
        for (int i = 0; i < a.length; i++) {
            while (a[i] != null) {
                ListNode cur = helpMap.get(count[i]);
                if (cur != null) {
                    cur.next = a[i];
                } else {
                    headMap.put(count[i], a[i]);
                }
                helpMap.put(count[i], a[i]);
                a[i] = a[i].next;
                count[i]++;
            }
        }
        ListNode lastNode = null;
        for (Map.Entry<Integer, ListNode> entry : helpMap.entrySet()) {
            int key = entry.getKey();
            ListNode value = entry.getValue();
            if (lastNode != null) {
                lastNode.next = headMap.get(key);
            }
            lastNode = value;
        }
        return head;
    }
}
