package com.algorithm.string;
/***
 * @Description: 字符串转化后的各位数字之和
 * @level easy
 * @author wtychn
 * @Date 2021/7/25
 */
public class LC_5823_GetLucky {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) - 'a' + 1);
        }
        String numString = sb.toString();
        int num = 0;
        for (int i = 0; i < numString.length(); i++) {
            num += Integer.parseInt("" + numString.charAt(i));
        }
        for (int i = 1; i < k; i++) {
            int temp = num;
            num = 0;
            while (temp > 0) {
                num += temp % 10;
                temp /= 10;
            }
        }
        return num;
    }
}
