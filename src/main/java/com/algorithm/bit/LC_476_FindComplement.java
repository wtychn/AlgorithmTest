package com.algorithm.bit;

/***
 * @Description: 数字的补数
 * @level easy
 * @author wtychn
 * @Date 2021/10/18
 */
public class LC_476_FindComplement {
    public int findComplement(int num) {
        // log(e)num / log(e)2 = log(2)num
        return num ^ ((1 << ((int) (Math.log(num) / Math.log(2) + 1))) - 1);
    }
}
