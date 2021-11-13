package com.algorithm.string;

/**
 * @Description: 检测大写字母
 * @level easy
 * @author wtychn
 * @Date 2021/11/13
 */
public class LC_520_DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        boolean higher = word.charAt(0) <= 'Z';
        for (int i = 1; i < word.length(); i++) {
            boolean cur = word.charAt(i) <= 'Z';
            if (cur != higher) {
                if (i == 1 && higher) {
                    higher = false;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
