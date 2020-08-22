package com.algorithm.math;

public class Offer_44_FindNthDigit {
    public int findNthDigit(int n) {
        int digit = 1; //数字位数
        long start = 1; //起始数字
        long count = 9; //数字数量
        //确定数字所在区间，如 1-9 10-99 100-999等
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        //确定数字
        long num = start + (n - 1) / digit;
        //确定所求数位在哪一数位
        return Long.toString(num).charAt((n - 1) % digit) - '0';
    }
}
