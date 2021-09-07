package com.algorithm.math;

import java.util.Scanner;
/***
 * @Description: 找到小于 n 的完美数
 * @level mid
 * @author wtychn
 * @Date 2021/9/7
 */
public class Baidu_9_7_2 {

    private String solution(String s) {
        StringBuilder res = new StringBuilder();
        int index = 0;
        boolean big = false;
        while (index < s.length()) {
            char c = s.charAt(index);
            int num = c - '0';
            if (num > 3 || big) {
                res.append('3');
                big = true;
            } else if (num == 0) {
                int count = 0;
                while (index < s.length() && s.charAt(index) - '0' == 0) {
                    count++;
                    index++;
                }
                index--;
                char cache = res.charAt(res.length() - 1);
                res.deleteCharAt(res.length() - 1);
                if (cache != '1') {
                    res.append(cache - 1 - '0');
                }
                for (int i = 0; i < count; i++) {
                    res.append('3');
                }
            } else {
                res.append(num);
            }
            index++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.next();
        }

        Baidu_9_7_2 main = new Baidu_9_7_2();
        for (int i = 0; i < n; i++) {
            System.out.println(main.solution(input[i]));
        }
    }
}
