package com.algorithm.array;

import com.algorithm.queue.LCPGroup_1_StoreWater;
import org.junit.Test;

public class LCPGroup_1_StoreWaterTest {

    @Test
    public void storeWater() {
        LCPGroup_1_StoreWater l = new LCPGroup_1_StoreWater();
        int[] bucket = new int[]{9, 0, 1};
        int[] vat = new int[]{0, 0, 1};
        System.out.println(l.storeWater(bucket, vat));
    }
}