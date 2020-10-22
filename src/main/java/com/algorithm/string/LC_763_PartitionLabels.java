package com.algorithm.string;

import java.util.ArrayList;
import java.util.List;

public class LC_763_PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        int[] finalLetters = new int[26];
        char[] s = S.toCharArray();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            finalLetters[s[i] - 'a'] = i;
        }

        int lastIndex = 0, curIndex = 0, cutPoint;
        while (curIndex < s.length) {
            cutPoint = finalLetters[s[curIndex] - 'a'];
            while (curIndex < cutPoint) {
                curIndex++;
                cutPoint = Math.max(finalLetters[s[curIndex] - 'a'], cutPoint);
            }
            res.add(++curIndex - lastIndex);
            lastIndex = curIndex;
        }
        return res;
    }
}
