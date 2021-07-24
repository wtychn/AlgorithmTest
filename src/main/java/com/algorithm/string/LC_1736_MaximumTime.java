package com.algorithm.string;
/***
 * @Description: 替换隐藏数字得到的最晚时间
 * @level easy
 * @author wtychn
 * @Date 2021/7/24
 */
public class LC_1736_MaximumTime {
    public String maximumTime(String time) {
        char[] chars = time.toCharArray();
        if(chars[0] == '?') chars[0] = chars[1] > '3' && chars[1] != '?' ? '1' : '2';
        if(chars[1] == '?') chars[1] = chars[0] == '2' ? '3' : '9';
        if(chars[3] == '?') chars[3] = '5';
        if(chars[4] == '?') chars[4] = '9';
        return new String(chars);
    }
}
