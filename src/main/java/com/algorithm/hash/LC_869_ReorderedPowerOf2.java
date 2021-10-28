package com.algorithm.hash;

import java.util.HashSet;
import java.util.Set;

/***
 * @Description: 重新排序得到 2 的幂
 * @level mid
 * @author wtychn
 * @Date 2021/10/28
 */
public class LC_869_ReorderedPowerOf2 {
    Set<String> powerOf2Digits = new HashSet<>();

    public boolean reorderedPowerOf2(int n) {
        init();
        return powerOf2Digits.contains(countDigits(n));
    }

    public void init() {
        for (int n = 1; n <= 1e9; n <<= 1) {
            powerOf2Digits.add(countDigits(n));
        }
    }

    public String countDigits(int n) {
        char[] cnt = new char[10];
        while (n > 0) {
            ++cnt[n % 10];
            n /= 10;
        }
        return new String(cnt);
    }
}
