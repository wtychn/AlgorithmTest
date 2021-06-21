package com.algorithm.bit;

import java.util.ArrayList;
import java.util.List;
/***
 * @Description: 二进制手表
 * @level easy
 * @author wtychn
 * @Date 2021/6/21
 */
public class LC_401_ReadBinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        // 枚举 1024 种可能性
        for (int i = 0; i < 1024; i++) {
            int h = i >> 6, m = i & 63;
            if (h < 12 && m < 60 && Integer.bitCount(i) == turnedOn)
                res.add(h + ":" + (m < 10 ? "0" : "") + m);
        }
        return res;
    }
}
