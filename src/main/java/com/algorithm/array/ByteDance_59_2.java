package com.algorithm.array;

import java.util.Scanner;
/***
 * @Description: 反转 0 1 字符串区间
 * @level mid
 * @author wtychn
 * @Date 2021/5/10
 */
public class ByteDance_59_2 {
    private String solution(char[] nums, int[][] order) {
        for (int[] part : order) {
            for (int i = part[0] - 1; i < part[1]; i++) {
                nums[i] = nums[i] == '0' ? '1' : '0';
            }
        }
        StringBuilder res = new StringBuilder();
        for (char c : nums) {
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        String num = s.next();
        char[] nums = num.toCharArray();
        int[][] order = new int[q][2];
        for (int i = 0; i < q; i++) {
            order[i][0] = s.nextInt();
            order[i][1] = s.nextInt();
        }

        ByteDance_59_2 main = new ByteDance_59_2();
        System.out.println(main.solution(nums, order));
    }
}
