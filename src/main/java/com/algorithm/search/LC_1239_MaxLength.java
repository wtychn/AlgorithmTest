package com.algorithm.search;

import java.util.ArrayList;
import java.util.List;

/***
 * @Description: 串联字符串的最大长度
 * @level mid
 * @author wtychn
 * @Date 2021/6/19
 */
public class LC_1239_MaxLength {
    int ans;
    List<Integer> masks;

    public int maxLength(List<String> arr) {
        masks = new ArrayList<>();
        for (String str : arr) {
            int mask = 0;
            for (int i = 0; i < str.length(); i++) {
                int charIdx = str.charAt(i) - 'a';
                if (((mask >> charIdx) & 1) != 0) {
                    mask = 0;
                    break;
                }
                mask |= 1 << charIdx;
            }
            if(mask != 0) masks.add(mask);
        }

        backtrack(0, 0);
        return ans;
    }

    private void backtrack(int pos, int mask) {
        if (pos == masks.size()) {
            ans = Math.max(ans, Integer.bitCount(mask));
            return;
        }
        if ((mask & masks.get(pos)) == 0) {
            backtrack(pos + 1, mask | masks.get(pos));
        }
        backtrack(pos + 1, mask);
    }
}
