package com.algorithm.linklist;
/***
 * @Description: 扁平化多级双向链表
 * @level mid
 * @author wtychn
 * @Date 2021/9/24
 */
public class LC_430_Flatten {

    public ComplexNode flatten(ComplexNode head) {
        recur(head);
        return head;
    }

    private ComplexNode recur(ComplexNode node) {
        ComplexNode cur = node;
        ComplexNode last = null;

        while (cur != null) {
            ComplexNode next = cur.next;
            if (cur.child != null) {
                ComplexNode childLast = recur(cur.child);
                cur.next = cur.child;
                cur.child.prev = cur;
                if (next != null) {
                    childLast.next = next;
                    next.prev = childLast;
                }
                cur.child = null;
                last = childLast;
            } else {
                last = cur;
            }
            cur = next;
        }

        return last;
    }

}

class ComplexNode {
    public int val;
    public ComplexNode prev;
    public ComplexNode next;
    public ComplexNode child;
}