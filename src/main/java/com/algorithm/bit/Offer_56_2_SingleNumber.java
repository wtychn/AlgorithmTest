package com.algorithm.bit;

/**
 * @program: AlgorithmTest
 * @description: offer52-2
 * @author: Mr.Wang
 * @create: 2020-07-25 15:47
 **/
public class Offer_56_2_SingleNumber {
    public int singleNumber(int[] nums) {
        //每一位转化成两位二进制即two、one，做有限状态自动机
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        //根据题意，出现一次或三次只有one不同，two位都是零。所以只返回one即可
        return ones;
    }
}
