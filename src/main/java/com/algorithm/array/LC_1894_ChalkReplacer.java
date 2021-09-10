package com.algorithm.array;

/***
 * @Description: 找到需要补充粉笔的学生编号
 * @level mid
 * @author wtychn
 * @Date 2021/9/10
 */
public class LC_1894_ChalkReplacer {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
            if (sum > k) {
                return i;
            }
        }
        int remainder = (int) (k % sum);
        for (int i = 0; i < chalk.length; i++) {
            remainder -= chalk[i];
            if (remainder < 0) {
                return i;
            }
        }
        return -1;
    }
}
