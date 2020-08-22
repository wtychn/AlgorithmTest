package com.algorithm.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_33_VerifyPostOrderTest {

    @Test
    public void verifyPoster_stack() {
        int[] postorder = {1, 3, 2, 6, 5};
        Offer_33_VerifyPostOrder verifyPostOrder = new Offer_33_VerifyPostOrder();
        System.out.println(verifyPostOrder.verifyPoster_stack(postorder));
        System.out.println(verifyPostOrder.verifyPostorder_recur(postorder));
    }
}