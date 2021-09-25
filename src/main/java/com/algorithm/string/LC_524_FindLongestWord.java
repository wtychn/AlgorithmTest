package com.algorithm.string;

import java.util.List;

/***
 * @Description: 通过删除字母匹配到字典里最长单词
 * @level mid
 * @author wtychn
 * @Date 2021/9/14
 */
public class LC_524_FindLongestWord {
    public String findLongestWord(String s, List<String> dictionary) {
        dictionary.sort((a, b) -> a.length() != b.length() ?
                b.length() - a.length() :
                a.compareTo(b));
        for (String target : dictionary) {
            if(isMatch(s, target))
                return target;
        }
        return "";
    }

    private boolean isMatch(String src, String target) {
        int targetIdx = 0;
        for (int srcIdx = 0; srcIdx < src.length(); srcIdx++) {
            if (targetIdx == target.length())
                return true;

            if (src.charAt(srcIdx) == target.charAt(targetIdx))
                targetIdx++;
        }
        return targetIdx == target.length();
    }
}
