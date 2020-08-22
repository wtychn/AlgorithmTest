package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: AlgorithmTest
 * @description: lc93
 * @author: Mr.Wang
 * @create: 2020-08-09 10:13
 **/
public class LC_93_RestoreIpAddresses {
    static final int SEG_COUNT = 4;
    List<String> ans = new ArrayList<>();
    int[] segments;

    public List<String> restoreIpAddresses(String s) {
        segments = new int[SEG_COUNT];
        recur(s, 0, 0);
        return ans;
    }

    private void recur(String s, int segCur, int segCount) {
        //找齐了四段ip且遍历完成，则作为一个答案；未遍历完成或未找齐四段则回溯
        if (segCount == SEG_COUNT && segCur == s.length()) {
            StringBuilder ipAddr = new StringBuilder();
            for (int segment : segments) {
                ipAddr.append(segment);
                ipAddr.append('.');
            }
            ipAddr.deleteCharAt(ipAddr.length() - 1);
            ans.add(ipAddr.toString());
            return;
        } else if (segCount == SEG_COUNT || segCur == s.length()) {
            return;
        }

        //若开头为0，则直接算作一个字段
        if (s.charAt(segCur) == '0') {
            segments[segCount] = 0;
            recur(s, segCur + 1, segCount + 1);
        }

        //一般情况，枚举所有可能性递归
        int sum = 0;
        for (int i = segCur; i < s.length(); i++) {
            sum = sum * 10 + (s.charAt(i) - '0');
            if (sum > 0 && sum <= 255) {
                segments[segCount] = sum;
                recur(s, i + 1, segCount + 1);
            } else {
                break;
            }
        }
    }
}
