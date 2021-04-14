package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;
/***
 * @Description: 数组操作
 * @level hw2
 * @author wtychn
 * @Date 2021/4/14
 */
public class HW_414_2 {
    public String solution(int[] array) {
        int count60 = 1, count4 = 0;
        List<Integer> res = new ArrayList<>();
        res.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] - array[i] >= 9) {
                count4++;
                if(count4 >= 4) count60 = 0;
            } else {
                if (count4 >= 4) {
                    for (int j = Math.max(0, i - count4 - 4); j < Math.min(array.length, i + 3); j++)
                        res.add(array[j]);
                    count60 = -2;
                    count4 = 0;
                    continue;
                }
                if (count60 == 60 || count60 == 0)
                    res.add(array[i]);
            }
            count60++;
        }
        StringBuilder sb = new StringBuilder();
        for (Integer n : res)
            sb.append(n).append(",");
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
