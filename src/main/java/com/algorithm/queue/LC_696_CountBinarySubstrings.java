package com.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @program: AlgorithmTest
 * @description: lc696
 * @author: Mr.Wang
 * @create: 2020-08-10 10:29
 **/
public class LC_696_CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int cur = 0, last = 0, res = 0;
        //记录1、0数量分组，数量较少的加入结果中
        while (cur < s.length()) {
            int count = 0;
            char curStart = s.charAt(cur);
            while (cur < s.length() && s.charAt(cur) == curStart) {
                cur++;
                count++;
            }
            res += Math.min(count, last);
            last = count;
        }
        return res;
    }
}
