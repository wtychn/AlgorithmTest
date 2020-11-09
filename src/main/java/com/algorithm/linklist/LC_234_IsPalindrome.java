package com.algorithm.linklist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/***
 * @Description: 判断回文链表
 * @level easy
 * @author wtychn
 * @Date 2020/10/23
 */
public class LC_234_IsPalindrome {
    //暴力法：转换成list
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        List<Integer> nodes = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            nodes.add(cur.val);
            cur = cur.next;
        }
        int header = 0, tail = nodes.size() - 1;
        while (header < tail) {
            if(!nodes.get(header).equals(nodes.get(tail))) return false;
            header++;
            tail--;
        }
        return true;
    }

    //快慢双指针 + 反转链表
    public boolean isPalindrome_fspointers(ListNode head) {
        if(head == null || head.next ==null) return true;

        ListNode curh = head, curr = reverseList(findMiddle(head));
        while (curr != null) {
            if (curh.val != curr.val) {
                return false;
            } else {
                curh = curh.next;
                curr = curr.next;
            }
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode fast = head, low = head;
        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
        }
        return low;
    }
}
