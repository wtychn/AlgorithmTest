package com.algorithm.linklist;

import junit.framework.TestCase;

public class LC_147_InsertionSortListTest extends TestCase {

    public void testInsertionSortList() {
        ListNode test = ListNode.test();
        LC_147_InsertionSortList insert = new LC_147_InsertionSortList();
        ListNode res = insert.insertionSortList(test);
        while (res != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }
        System.out.print("null");
    }
}