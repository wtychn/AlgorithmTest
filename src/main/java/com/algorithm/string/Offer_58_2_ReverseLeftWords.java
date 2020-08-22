package com.algorithm.string;

/**
 * @program: AlgorithmTest
 * @description: offer58-2
 * @author: Mr.Wang
 * @create: 2020-07-27 19:17
 **/
public class Offer_58_2_ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public String reverseLeftWords_traversal(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = n; i < n + s.length(); i++) {
            result.append(s.charAt(i % s.length()));
        }
        return result.toString();
    }
}
