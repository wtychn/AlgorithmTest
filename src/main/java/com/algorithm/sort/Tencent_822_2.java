package com.algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

/***
 * @Description: 魔法问题
 * @level easy
 * @author wtychn
 * @Date 2021/8/22
 */
public class Tencent_822_2 {
    private void solution(int[] nums) {
        int res = 0;
        int prefixSum = 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            int cur = nums[i] + prefixSum;
            res = (res + cur) % 1000000007;
            prefixSum = (cur + prefixSum) % 1000000007;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        Tencent_822_2 main = new Tencent_822_2();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = s.nextInt();
            }
            main.solution(nums);
        }
    }
}
