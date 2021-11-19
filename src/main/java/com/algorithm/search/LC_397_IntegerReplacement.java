package com.algorithm.search;

import java.util.HashMap;
import java.util.Map;

/***
 * @Description: 整数替换
 * @level mid
 * @author wtychn
 * @Date 2021/11/19
 */
public class LC_397_IntegerReplacement {
    Map<Integer, Integer> map = new HashMap<>();

    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }
        if(!map.containsKey(n)) {
            if (n % 2 == 0) {
                map.put(n, integerReplacement(n / 2) + 1);
            } else {
                // 如果使用 (n + 1) / 2 的话 n = 2 ^ 31 - 1 时计算会造成栈溢出
                map.put(n, Math.min(integerReplacement(n / 2), integerReplacement(n / 2 + 1)) + 2);
            }
        }
        return map.get(n);
    }
}
