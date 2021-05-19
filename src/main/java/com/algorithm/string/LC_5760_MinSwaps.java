package com.algorithm.string;
/***
 * @Description: 构成交替字符串需要的最小交换次数
 * @level mid
 * @author wtychn
 * @Date 2021/5/16
 */
public class LC_5760_MinSwaps {
    public int minSwaps(String s) {
        char[] chars = s.toCharArray();
        int oneC = 0, zeroC = 0;
        for (char aChar : chars) {
            if(aChar == '1') oneC++;
            else zeroC++;
        }
        if(Math.abs(oneC - zeroC) > 1) return -1;

        int res = Integer.MAX_VALUE;
        // "1010..."
        if (oneC == (chars.length + 1) / 2 && zeroC == chars.length / 2) {
            int res1 = 0;
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] - '0' == i % 2) res1++;
            }
            res = res1 / 2;
        }
        // "0101..."
        if (zeroC == (chars.length + 1) / 2 && oneC == chars.length / 2) {
            int res2 = 0;
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] - '0' != i % 2) res2++;
            }
            res = Math.min(res, res2 / 2);
        }
        return res;
    }
}
