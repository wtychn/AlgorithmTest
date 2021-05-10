package com.algorithm.search;
/***
 * @Description: 将字符串拆分为递减的连续值
 * @level mid
 * @author wtychn
 * @Date 2021/5/3
 */
public class LC_5747_SplitString {
    String s;

    public boolean splitString(String s) {
        this.s = s;
        long cur = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            cur = cur * 10 + s.charAt(i) - '0';
            if(dfs(cur, i + 1)) return true;
        }
        return false;
    }

    private boolean dfs(long pre, int i) {
        if(i == s.length()) return true;
        long cur = 0;
        for (int j = i; j < s.length(); j++) {
            cur = cur * 10 + s.charAt(j) - '0';
            if(pre - cur == 1 && dfs(cur, j + 1)) return true;
            if(pre <= cur) break;
        }
        return false;
    }
}
