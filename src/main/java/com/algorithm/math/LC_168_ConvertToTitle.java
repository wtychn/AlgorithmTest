package com.algorithm.math;
/***
 * @Description: Excel 表列名称
 * @level easy
 * @author wtychn
 * @Date 2021/6/29
 */
public class LC_168_ConvertToTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            int offset = --columnNumber % 26;
            res.insert(0, (char) ('A' + offset));
            columnNumber /= 26;
        }
        return res.toString();
    }
}
