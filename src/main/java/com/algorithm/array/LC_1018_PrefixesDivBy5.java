package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;

public class LC_1018_PrefixesDivBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int prefix = 0;
        for (int j : A) {
            //保留整个二进制数会导致溢出，因此只保留余数
            prefix = (prefix * 2 + j) % 5;
            res.add(prefix == 0);
        }
        return res;
    }
}
