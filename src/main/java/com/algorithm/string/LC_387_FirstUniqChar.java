package com.algorithm.string;
/***
 * @Description: 字符串中第一个唯一字符  
 * @level easy 
 * @author wtychn
 * @Date 2020/12/23
 */
public class LC_387_FirstUniqChar {
    public int firstUniqChar(String s) {
        int[][] freq = new int[26][2];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            freq[chars[i] - 'a'][0]++;
            freq[chars[i] - 'a'][1] = i;
        }
        int res = Integer.MAX_VALUE;
        for (int[] ints : freq) {
            if (ints[0] == 1) res = Math.min(res, ints[1]);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
