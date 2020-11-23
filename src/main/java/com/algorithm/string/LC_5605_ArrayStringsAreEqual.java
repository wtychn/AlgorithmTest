package com.algorithm.string;
/***
 * @Description: 检查两个字符串是否相等
 * @level easy
 * @author wtychn
 * @Date 2020/11/22
 */
public class LC_5605_ArrayStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (String s : word1) {
            s1.append(s);
        }
        for (String s : word2) {
            s2.append(s);
        }
        return s1.toString().equals(s2.toString());
    }
}
