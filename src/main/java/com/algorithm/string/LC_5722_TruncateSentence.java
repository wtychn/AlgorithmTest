package com.algorithm.string;
/***
 * @Description: 截断句子  
 * @level easy 
 * @author wtychn
 * @Date 2021/4/4
 */
public class LC_5722_TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(strings[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
