package com.algorithm.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_53_SearchTest {

    @Test
    public void search() {
        int[] nums = {5,7,7,8,8,10};
        Offer_53_Search search = new Offer_53_Search();
        System.out.println(search.search(nums, 10));
    }
}