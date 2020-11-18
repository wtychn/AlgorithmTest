package com.algorithm.array;

/***
 * @Description: 找数组中差值最大的数对
 * @level easy
 * @author wtychn
 * @Date 2020/10/25
 */
public class LC_5546_SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char result = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            if ((releaseTimes[i] - releaseTimes[i - 1]) >= max) {
                max = releaseTimes[i] - releaseTimes[i - 1];
                result = keysPressed.charAt(i);
            }
        }
        return result;
    }
}
