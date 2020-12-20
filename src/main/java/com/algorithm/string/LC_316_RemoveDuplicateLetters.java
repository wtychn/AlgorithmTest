package com.algorithm.string;
/***
 * @Description: 去除重复字母  
 * @level mid
 * @author wtychn
 * @Date 2020/12/20
 */
public class LC_316_RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26]; // 计数桶
        boolean[] visited = new boolean[26]; // 记录是否存过
        // 计数
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!visited[ch - 'a']) {
                // 模拟单调栈将字典序小的字符放前面
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
                    // 如果后面还有同样的字符就可以删掉
                    if (count[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                        visited[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        break;
                    }
                }
                sb.append(ch);
                visited[ch - 'a'] = true;
            }
            count[ch - 'a']--;
        }

        return sb.toString();
    }
}
