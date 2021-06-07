package com.algorithm.string;
/***
 * @Description: 使二进制字符串字符交替的最少反转次数
 * @level mid
 * @author wtychn
 * @Date 2021/6/7
 */
public class LC_5778_MinFlips {
    public int minFlips(String s) {
        int len = s.length();
        char[] target = {'0', '1'};

        int cnt = 0;
        for (int i = 0; i < len; i++) {
            cnt += s.charAt(i) != target[i % 2] ? 1 : 0;
        }

        s += s;
        int ans = Math.min(cnt, len - cnt);
        for (int i = 0; i < len; i++) {
            cnt -= s.charAt(i) != target[i % 2] ? 1 : 0;
            cnt += s.charAt(i + len) != target[(i + len) % 2] ? 1 : 0;
            ans = Math.min(ans, Math.min(cnt, len - cnt));
        }

        return ans;
    }
}
