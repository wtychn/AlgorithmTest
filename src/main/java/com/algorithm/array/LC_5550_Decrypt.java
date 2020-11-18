package com.algorithm.array;
/***
 * @Description: 计算密码
 * @level easy
 * @author wtychn
 * @Date 2020/11/15
 */
public class LC_5550_Decrypt {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        for (int i = 0; i < res.length; i++) {
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    res[i] += code[(i + j) % res.length];
                }
            } else if (k < 0) {
                for (int j = k; j < 0; j++) {
                    int judge = (i + j) % res.length;
                    int index = judge < 0 ? judge + res.length : judge;
                    res[i] += code[index];
                }
            }
        }
        return res;
    }
}
