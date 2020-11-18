package com.algorithm.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: AlgorithmTest
 * @description: lc6
 * @author: Mr.Wang
 * @create: 2020-08-07 11:12
 **/
public class LC_6_Convert {
    public String convert(String s, int numRows) {
        if(numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        boolean convertFlag = true;
        int rowNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(rowNum == numRows - 1 || rowNum == 0) convertFlag = !convertFlag;
            if (convertFlag) {
                rows.get(rowNum--).append(s.charAt(i));
            } else {
                rows.get(rowNum++).append(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : rows) res.append(sb);
        return res.toString();
    }
}
