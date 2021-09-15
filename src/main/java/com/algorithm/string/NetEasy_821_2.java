package com.algorithm.string;
/***
 * @Description: 计算 k 位
 * @level mid
 * @author wtychn
 * @Date 2021/8/21
 */
public class NetEasy_821_2 {
    public char findKthBit (int n, int k) {
        return sPrint(n).charAt(k - 1);
    }

    private String sPrint(int i) {
        if(i == 1) return "a";
        return sPrint(i - 1) +
                (char) ('a' + i - 1) +
                new StringBuilder(invert(sPrint(i - 1))).reverse();
    }

    private String invert(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            c = (char) ('a' + 'z' - c);
            sb.setCharAt(i, c);
        }
        return sb.toString();
    }
}
