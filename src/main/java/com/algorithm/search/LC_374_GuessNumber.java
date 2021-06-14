package com.algorithm.search;
/***
 * @Description: 猜数字大小
 * @level easy
 * @author wtychn
 * @Date 2021/6/14
 */
public class LC_374_GuessNumber {
    public int guessNumber(int n) {
        int l = 1, r = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if(guess(m) == 1) r = m - 1;
            else if(guess(m) == -1) l = m + 1;
            else return m;
        }
        return -1;
    }

    int guess(int num) {
        return Integer.compare(num, 6);
    }
}
