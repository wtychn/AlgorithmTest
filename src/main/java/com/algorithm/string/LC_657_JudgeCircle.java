package com.algorithm.string;

/**
 * @program: AlgorithmTest
 * @description: lc657
 * @author: Mr.Wang
 * @create: 2020-08-31 09:19
 **/
public class LC_657_JudgeCircle {
    public boolean judgeCircle(String moves) {
        int lCount = 0, dCount = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    lCount++;
                    break;
                case 'D':
                    dCount++;
                    break;
                case 'R':
                    lCount--;
                    break;
                case 'U':
                    dCount--;
                    break;
            }
        }
        return lCount == 0 && dCount == 0;
    }
}
