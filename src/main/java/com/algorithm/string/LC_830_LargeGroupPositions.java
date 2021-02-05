package com.algorithm.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/***
 * @Description: 较大分组位置  
 * @level easy 
 * @author wtychn
 * @Date 2021/1/5
 */
public class LC_830_LargeGroupPositions {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int start = 0, end = 0;
        while (end <= s.length()) {
            if (end == s.length() || s.charAt(start) != s.charAt(end)) {
                int length = end - start;
                if (length >= 3) {
                    res.add(Arrays.asList(start, end - 1));
                }
                if (end == s.length()) break;
                start = end;
            } else {
                end++;
            }
        }
        return res;
    }
}
