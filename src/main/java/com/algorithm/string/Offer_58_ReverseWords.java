package com.algorithm.string;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @program: AlgorithmTest
 * @description: offer58
 * @author: Mr.Wang
 * @create: 2020-07-27 18:27
 **/
public class Offer_58_ReverseWords {
    public String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        Stack<String> stringStack = new Stack<>();
        for (String str : strings) {
            if(!str.equals("")) stringStack.add(str);
        }
        StringBuilder res = new StringBuilder();
        while (!stringStack.isEmpty()) {
            res.append(stringStack.pop());
            res.append(" ");
        }
        return res.toString().trim();
    }
}
