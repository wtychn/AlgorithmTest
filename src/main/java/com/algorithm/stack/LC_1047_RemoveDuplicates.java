package com.algorithm.stack;

/***
 * @Description: 删除字符串中的所有相邻重复项  
 * @level easy 
 * @author wtychn
 * @Date 2021/3/10
 */
public class LC_1047_RemoveDuplicates {
    public String removeDuplicates(String S) {
        StringBuilder stack = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (stack.length() != 0 && stack.charAt(stack.length() - 1) == c) {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}
