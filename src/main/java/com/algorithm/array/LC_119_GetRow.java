package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;
/***
 * @Description: 杨辉三角2  
 * @level easy 
 * @author wtychn
 * @Date 2021/2/12
 */
public class LC_119_GetRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            res.add(0);
            for (int j = i; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }
        return res;
    }
}
