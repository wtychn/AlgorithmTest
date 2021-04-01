package com.algorithm.stack;

import java.util.Deque;
import java.util.LinkedList;
/***
 * @Description: 笨阶乘  
 * @level mid
 * @author wtychn
 * @Date 2021/4/1
 */
public class LC_1006_Clumsy {
    public int clumsy(int N) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(N);
        N--;
        int index = 0;
        while (N > 0) {
            int flag = index % 4;
            if (flag == 0) {
                stack.push(stack.pop() * N);
            } else if (flag == 1) {
                stack.push(stack.pop() / N);
            } else if (flag == 2) {
                stack.push(N);
            } else {
                stack.push(-N);
            }
            N--;
            index++;
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
