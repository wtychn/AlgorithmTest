package com.algorithm.dynamic_programming;

import java.util.Scanner;

/***
 * @Description: 01串的价值
 * @level mid
 * @author wtychn
 * @Date 2021/9/5
 */
public class Tencent_9_5_3 {

    private int solution(String s) {
        char[] chars = s.toCharArray();
        return recur(chars, 1, chars[0], 1, 1);
    }

    private int recur(char[] chars, int i, char last, int score, int lastScore) {
        if(i == chars.length) return score;
        return Math.max(recur(chars, i + 1, last, score, lastScore),
                recur(chars, i + 1, chars[i], chars[i] == last ? score + lastScore + 1 : score + 1,
                        chars[i] == last ? lastScore + 1 : 1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();

        Tencent_9_5_3 main = new Tencent_9_5_3();
        System.out.println(main.solution(str));
    }
}
