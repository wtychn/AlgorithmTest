package com.algorithm.array;

/***
 * @Description: 猜数字游戏
 * @level mid
 * @author wtychn
 * @Date 2021/11/8
 */
public class LC_299_GetHint {
    public String getHint(String secret, String guess) {
        int n = secret.length();
        int[] count = new int[10];
        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                a++;
            } else {
                if (count[s - '0']++ < 0) {
                    b++;
                }
                if (count[g - '0']-- > 0) {
                    b++;
                }
            }
        }
        return a + "A" + b + "B";
    }
}
