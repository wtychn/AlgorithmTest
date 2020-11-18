package com.algorithm.bit;

/**
 * @program: AlgorithmTest
 * @description: offer56
 * @author: Mr.Wang
 * @create: 2020-07-25 15:09
 **/
public class Offer_56_SingleNumbers {
    public int[] singleNumbers(int[] nums) {
        int originRes = 0;
        for (int num : nums) {
            originRes ^= num;
        }

        int mask = 1;//选取异或结果中最低位的 1 作为掩码，用来分组异或
        while ((originRes & mask) == 0) {
            mask <<= 1;
        }

        int[] res = new int[2];
        for (int num : nums) {
            if ((num & mask) == 0) res[0] ^= num;
            else res[1] ^= num;
        }
        return res;
    }
}
