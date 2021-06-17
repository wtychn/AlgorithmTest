package com.algorithm.dynamic_programming;

import java.util.Scanner;
/***
 * @Description: 背包问题
 * @level mid
 * @author wtychn
 * @Date 2021/6/17
 */
public class Vivo_617_2 {
    public int solution(int C, int[] w, int[] v) {
        // dp[i] 代表 i 重量时得到的最大价值
        // 二维动规经过优化使用一维动规数组实现
        int[] dp = new int[C + 1];
        for (int i = 0; i < w.length; i++) {
            for (int j = C; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
            }
        }
        return dp[C];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int weight = Integer.parseInt(s.nextLine());
        String ws = s.nextLine();
        String vs = s.nextLine();
        String[] weights = ws.split(",");
        String[] values = vs.split(",");
        int[] w = new int[weights.length];
        int[] v = new int[values.length];
        for (int i = 0; i < w.length; i++) {
            w[i] = Integer.parseInt(weights[i]);
            v[i] = Integer.parseInt(values[i]);
        }

        Vivo_617_2 main = new Vivo_617_2();
        System.out.println(main.solution(weight, w, v));
    }
}
