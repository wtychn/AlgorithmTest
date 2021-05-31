package com.algorithm.string;

import java.util.*;
/***
 * @Description: 找到字符串中包含所有字符的最短连续子串
 * @level
 * @author wtychn
 * @Date 2021/5/30
 */
public class BD_530_1 {
    private int[] solution(String s) {
        if(s.length() <= 1) return new int[]{0, s.length()};
        int l = 0, r = s.length() - 1;
        int start = 0;
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), null);
        }
        int length = map.keySet().size();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 记录所有相同元素的位置
            if (map.get(c) == null) {
                map.put(c, new LinkedList<>());
                length--;
            }
            map.get(c).add(i);
            // 去除开头的多余元素
            while (map.get(s.charAt(start)).size() > 1) {
                map.get(s.charAt(start)).remove(0);
                start++;
            }
            // 记录最小值
            if (length == 0 && i - start < r - l) {
                l = start;
                r = i;
            }
        }
        return new int[]{l, r - l + 1};
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        BD_530_1 main = new BD_530_1();
        main.solution(str);
        int[] res = main.solution(str);
        System.out.println(res[0] + "," + res[1]);
    }
}
