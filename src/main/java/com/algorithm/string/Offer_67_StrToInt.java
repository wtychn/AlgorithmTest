package com.algorithm.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: AlgorithmTest
 * @description: offer67
 * @author: Mr.Wang
 * @create: 2020-08-03 09:23
 **/
public class Offer_67_StrToInt {
    public int strToInt(String str) {
        if(str == null || str.length() == 0) return 0;
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        if(i >= str.length()) return 0;
        int sign = 1;
        if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        }
        int res = 0, bndry = Integer.MAX_VALUE / 10;
        while (i < str.length() && str.charAt(i) > 47 && str.charAt(i) < 58) {
            if(res>bndry || res == bndry && str.charAt(i) > '7')
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (str.charAt(i) - 48);
            i++;
        }
        return res * sign;
    }
}
