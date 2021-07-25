package com.algorithm.string;
/***
 * @Description: 子字符串突变后可能得到的最大整数
 * @level mid
 * @author wtychn
 * @Date 2021/7/25
 */
public class LC_5824_MaximumNumber {
    public String maximumNumber(String num, int[] change) {
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int cur = chars[i] - '0';
            if (cur < change[cur]) {
                while (i < chars.length && chars[i] - '0' <= change[chars[i] - '0']) {
                    chars[i] = (char) (change[chars[i] - '0'] + '0');
                    i++;
                }
                break;
            }
        }
        return new String(chars);
    }
}
