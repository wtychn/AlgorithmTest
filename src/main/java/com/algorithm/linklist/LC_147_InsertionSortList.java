package com.algorithm.linklist;
/***
 * @Description: 链表插入排序
 * @level mid
 * @author wtychn
 * @Date 2020/11/20
 */
public class LC_147_InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode tl = fakeHead, tr = head;
        ListNode insertL = fakeHead, insertR = head;
        while (tr != null) {
            insertL = fakeHead;
            insertR = fakeHead.next;
            while (insertR.val < tr.val) {
                insertL = insertL.next;
                insertR = insertR.next;
            }
            if (insertR != tr) {
                insertL.next = tr;
                tl.next = tr.next;
                tr.next = insertR;
            } else {
                tl = tl.next;
            }
            tr = tl.next;
        }
        return fakeHead.next;
    }
}
