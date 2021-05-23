package com.algorithm.array;
/***
 * @Description: 哪种连续子字符串更长
 * @level easy
 * @author wtychn
 * @Date 2021/5/23
 */
public class LC_5763_CheckZeroOnes {
    public boolean checkZeroOnes(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int oneCnt = 0, zeroCnt = 0;
        for (int r = 1; r < chars.length; r++) {
            if (chars[r] != chars[l]) {
                if (chars[l] == '0') zeroCnt = Math.max(r - l, zeroCnt);
                else oneCnt = Math.max(r - l, oneCnt);
                l = r;
            }
        }
        if(chars[l] == '0') zeroCnt = Math.max(chars.length - l, zeroCnt);
        else oneCnt = Math.max(chars.length - l, oneCnt);
        return oneCnt > zeroCnt;
    }
}
