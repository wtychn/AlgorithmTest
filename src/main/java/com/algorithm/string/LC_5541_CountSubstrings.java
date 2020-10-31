package com.algorithm.string;
/***
 * @Description: 寻找两个字符串中只差一个字符的相同子串
 * @level mid
 * @author wtychn
 * @Date 2020/11/1
 */
public class LC_5541_CountSubstrings {
    public int countSubstrings(String s, String t) {
        int sLeft = 0, sRight;
        int tLeft = 0, tRight;
        int res = 0;
        while (sLeft < s.length()) {
            sRight = sLeft + 1;
            while (sRight <= s.length()) {
                String nS = s.substring(sLeft, sRight);

                while (tLeft <= t.length() - nS.length()) {
                    tRight = tLeft + nS.length();
                    String nT = t.substring(tLeft, tRight);
                    int diffCount = 0;
                    for (int i = 0; i < nS.length(); i++) {
                        if (nS.charAt(i) != nT.charAt(i)) {
                            diffCount++;
                        }
                    }
                    if (diffCount == 1) res++;
                    tLeft++;
                }

                sRight++;
                tLeft = 0;
            }
            sLeft++;
        }
        return res;
    }
}
