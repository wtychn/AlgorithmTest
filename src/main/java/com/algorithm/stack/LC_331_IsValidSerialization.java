package com.algorithm.stack;

/***
 * @Description: 验证二叉树的前序序列化  
 * @level mid
 * @author wtychn
 * @Date 2021/3/12
 */
public class LC_331_IsValidSerialization {
    // 栈优化成计数器，空间复杂度降为 O(1)
    public boolean isValidSerialization(String preorder) {
        int i = 0, count = 1;
        while (i < preorder.length()) {
            if (count <= 0) return false;
            char c = preorder.charAt(i);
            if (c == ',') {
                i++;
            } else if (c == '#') {
                count--;
                i++;
            } else {
                while (i < preorder.length() && preorder.charAt(i) != ',') {
                    i++;
                }
                count++; // count + 2 - 1
            }
        }
        return count == 0;
    }
}
