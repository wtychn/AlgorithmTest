package com.algorithm.string;
/***
 * @Description: Excel 表列序号
 * @level easy
 * @author wtychn
 * @Date 2021/7/30
 */
public class LC_171_TitleToNumber {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int num = columnTitle.charAt(i) - 'A' + 1;
            sum = sum * 26 + num;
        }
        return sum;
    }
}
