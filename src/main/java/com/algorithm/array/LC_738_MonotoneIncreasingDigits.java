package com.algorithm.array;
/***
 * @Description: 单调递减的数字  
 * @level mid 
 * @author wtychn
 * @Date 2020/12/16
 */
public class LC_738_MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        char[] chars = String.valueOf(N).toCharArray();
        int res = N;
        for (int i = 1; i < chars.length; i++) {
            // 寻找递增停止的位置
            if (chars[i] < chars[i - 1]) {
                int reIndex = i - 1;
                // 寻找符合要求的减小位
                while (reIndex > 0 && chars[reIndex] - 1 < chars[reIndex - 1]) {
                    reIndex--;
                }
                chars[reIndex] -= 1;
                // 减小位后的位都置为9
                for (int j = reIndex + 1; j < chars.length; j++) {
                    chars[j] = '9';
                }
                res = Integer.parseInt(String.copyValueOf(chars));
            }
        }
        return res;
    }
}
