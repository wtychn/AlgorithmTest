package com.algorithm.array;

import java.util.Arrays;

public class LC_455_FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gPointer = 0, sPointer = 0, res = 0;
        while (gPointer < g.length && sPointer < s.length) {
            if (s[sPointer] >= g[gPointer]) {
                res++;
                gPointer++;
            }
            sPointer++;
        }
        return res;
    }
}
