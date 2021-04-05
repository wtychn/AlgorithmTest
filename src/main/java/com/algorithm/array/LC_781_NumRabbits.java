package com.algorithm.array;

import java.util.Arrays;
/***
 * @Description: 森林中的兔子  
 * @level mid
 * @author wtychn
 * @Date 2021/4/4
 */
public class LC_781_NumRabbits {
    public int numRabbits(int[] answers) {
        if(answers.length == 0) return 0;
        Arrays.sort(answers);
        int left = 0;
        int res = 0;
        for (int i = 0; i <= answers.length; i++) {
            if (i == answers.length || answers[i] != answers[left]) {
                int count = i - left, n = answers[left];
                res += count % (n + 1) == 0 ? count / (n + 1) * (n + 1) : (count / (n + 1) + 1) * (n + 1);
                left = i;
            }
        }
        return res;
    }
}
