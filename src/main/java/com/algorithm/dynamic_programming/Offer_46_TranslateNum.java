package com.algorithm.dynamic_programming;

public class Offer_46_TranslateNum {
    public int translateNum(int num) {
        int a = 1, b = 1; //a为 dp[i-1], b为 dp[i-2]
        int x, y = num % 10; //y为当前位，x为前一位数字
        while (num != 0) {
            num /= 10;
            x = num % 10;
            int temp = x * 10 + y;
            int c = (temp >= 10 && temp <= 25) ? a + b : a;
            b = a;
            a = c;
            y = x;
        }
        return a;
    }
}
