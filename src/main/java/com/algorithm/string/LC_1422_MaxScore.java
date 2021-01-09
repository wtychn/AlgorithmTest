package com.algorithm.string;
/***
 * @Description: 分割字符串的最大得分  
 * @level easy
 * @author wtychn
 * @Date 2021/1/9
 */
public class LC_1422_MaxScore {
    public int maxScore(String s) {
        char[] chars = s.toCharArray();
        int Count0 = 0, Count1 = 0;
        int res = 0;
        for (char c : chars) {
            if(c == '1') Count1++;
        }
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '0') {
                Count0++;
            } else {
                Count1--;
            }
            res = Math.max(res, Count0 + Count1);
        }
        return res;
    }
}
