package com.algorithm.search;
/***
 * @Description: 可移除字符的最大数目
 * @level mid
 * @author wtychn
 * @Date 2021/6/13
 */
public class LC_5786_MaximumRemovals {
    public int maximumRemovals(String s, String p, int[] removable) {
        int l = 0;
        int r = removable.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i <= m; i++) {
                sb.setCharAt(removable[i], ' '); // 删除下标处元素
            }
            if(isSubsequence(sb.toString(), p)) l = m + 1;
            else r = m - 1;
        }
        return r + 1;
    }

    public boolean isSubsequence(String s, String p) {  // 判断p是否是s的子串
        int i = 0, j = 0;
        while (i < p.length() && j < s.length()) {
            i += p.charAt(i) == s.charAt(j) ? 1 : 0;
            j++;
        }
        return i == p.length();
    }
}
