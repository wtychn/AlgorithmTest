package com.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/***
 * @Description: 检查subarray能否组成等差数列
 * @level mid
 * @author wtychn
 * @Date 2020/10/25
 */
public class LC_5547_CheckArithmeticSubarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] newArray = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(newArray);
            int change = newArray[1] - newArray[0];
            boolean res = true;
            for (int j = 2; j < newArray.length; j++) {
                if (newArray[j] - newArray[j - 1] != change) {
                    res = false;
                    break;
                }
            }
            result.add(res);
        }
        return result;
    }
}
