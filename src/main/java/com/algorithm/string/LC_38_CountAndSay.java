package com.algorithm.string;
/***
 * @Description: 外观数列
 * @level mid
 * @author wtychn
 * @Date 2021/10/15
 */
public class LC_38_CountAndSay {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 1; i < n; i++) {
            res = transform(res);
        }
        return res;
    }

    private String transform(String s) {
        int count = 1;
        char tmp = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            char curNumber = s.charAt(i);
            if (curNumber == tmp) {
                count++;
            } else {
                sb.append(count).append(tmp);
                count = 1;
                tmp = curNumber;
            }
        }
        sb.append(count).append(tmp);
        return sb.toString();
    }
}
