package com.algorithm.search;

/**
 * @author wtychn
 * @Description: 固定分数求情况个数
 * @level easy
 * @Date 2022/4/20
 */
public class HW_220420_1 {
    int[] score;
    int count, N;
    
    public int solution(int N) {
        score = new int[25];
        for (int i = 0; i < 10; i++) {
            score[i] = 2;
        }
        for (int i = 10; i < 20; i++) {
            score[i] = 4;
        }
        for (int i = 20; i < 25; i++) {
            score[i] = 8;
        }
        count = 0;
        this.N = N;
        dfs(0,0, 0);

        return count;
    }

    private void dfs(int index, int sum, int error) {
        if (error >= 3 || index > 24) {
            return;
        }
        dfs(index + 1, sum, error + 1);
        sum += score[index];
        if (sum == N) {
            count++;
            return;
        }
        dfs(index + 1,sum, error);
    }

    public static void main(String[] args) {
        HW_220420_1 hw_220420_1 = new HW_220420_1();
        System.out.println(hw_220420_1.solution(100));
    }
}
