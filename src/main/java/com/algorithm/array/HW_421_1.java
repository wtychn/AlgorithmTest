package com.algorithm.array;

import java.util.Scanner;
/***
 * @Description: 棋牌室算时间座位
 * @level easy
 * @author wtychn
 * @Date 2021/4/21
 */
public class HW_421_1 {
    public int[] solution(int[][] nums, int cap) {
        int[] res = new int[24];
        for (int[] num : nums) {
            for (int i = num[0]; i < num[1]; i++) {
                if (res[i] + num[2] <= cap) {
                    res[i] += num[2];
                } else {
                    for (int j = i - 1; j >= num[0]; j--) {
                        res[j] -= num[2];
                    }
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cap = s.nextInt();
        int[][] nums = new int[n][3];
        for (int i = 0; i < n; i++) {
            nums[i][0] = s.nextInt();
            nums[i][1] = s.nextInt();
            nums[i][2] = s.nextInt();
        }

        HW_421_1 h = new HW_421_1();
        int[] res = h.solution(nums, cap);
        StringBuilder sb = new StringBuilder();
        for (int r : res) {
            sb.append(r).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
