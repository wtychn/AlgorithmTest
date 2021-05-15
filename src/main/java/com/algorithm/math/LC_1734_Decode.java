package com.algorithm.math;
/***
 * @Description: 解码异或后的排列
 * @level mid
 * @author wtychn
 * @Date 2021/5/11
 */
public class LC_1734_Decode {
    public int[] decode(int[] encoded) {
        int all = 0;
        for (int i = 1; i < encoded.length + 1; i++) {
            all ^= i;
        }
        int encode = 0;
        for (int i = 1; i < encoded.length; i += 2) {
            encode ^= encoded[i];
        }
        int[] res = new int[encoded.length + 1];
        res[0] = all ^ encode;
        for (int i = 1; i < res.length; i++) {
            res[i] = encoded[i - 1] ^ res[i - 1];
        }
        return res;
    }
}
