package com.algorithm.string;
/***
 * @Description:  删除一个字符串中所有出现的给定子字符串
 * @level mid
 * @author wtychn
 * @Date 2021/6/27
 */
public class LC_5781_RemoveOccurrences {
    public String removeOccurrences(String s, String part) {
        int sLen = s.length(), pLen = part.length();
        StringBuilder sb = new StringBuilder();
        //判断最后一个长度为pLen的子字符串是否和part匹配成功
        //维护一个长度为pLen的滑动窗口
        for (int i = 0; i <= sLen - pLen; ++i) {
            String str = s.substring(i, i + pLen);
            if (str.equals(part)) {
                s = sb + s.substring(i + pLen);
                sLen = s.length();
                sb.replace(0, sb.length(), "");
                i = -1;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return s;
    }
}
