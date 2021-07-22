package com.algorithm.string;

import java.util.HashSet;
import java.util.Set;
/***
 * @Description: 可输入最大单词数  
 * @level easy 
 * @author wtychn
 * @Date 2021/7/18
 */
public class LC_5161_CanBeTypedWords {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> brokenSet = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            brokenSet.add(brokenLetters.charAt(i));
        }
        String[] strs = text.split(" ");
        int res = 0;
        for (String str : strs) {
            int i = 0;
            for (; i < str.length(); i++) {
                if(brokenSet.contains(str.charAt(i))) break;
            }
            if(i == str.length()) res++;
        }
        return res;
    }
}
