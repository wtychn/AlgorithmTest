package com.algorithm.search;

import java.util.ArrayList;
import java.util.List;
/***
 * @Description: 寻找字符串中的斐波那契数列
 * @level mid
 * @author wtychn
 * @Date 2020/12/8
 */
public class LC_842_SplitIntoFibonacci {
    List<Integer> result;
    public List<Integer> splitIntoFibonacci(String S) {
        result = new ArrayList<>();
        return dfs(0, S, 0, 0, 0) ? result : new ArrayList<>();
    }

    private boolean dfs(int start, String s, int pre1, int pre2, int deep) {
        int n = s.length();
        if(start == n) return deep >= 3;

        for (int i = 1; i < 11; i++) {
            if(start + i > n || s.charAt(start) == '0' && i > 1) break;

            long num = Long.parseLong(s.substring(start, start + i));

            if (num >= Integer.MAX_VALUE || (deep != 0 && deep != 1 && num > (pre1 + pre2))) break;
            Integer numInt = (int) num;

            if (deep == 0 || deep == 1 || numInt == pre1 + pre2) {
                result.add(numInt);
                if (dfs(start + i, s, pre2, numInt, deep + 1)) return true;
                result.remove(numInt);
            }
        }
        return false;
    }
}
