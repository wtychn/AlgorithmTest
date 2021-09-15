package com.algorithm.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/***
 * @Description: 奇偶分组的最小组数
 * @level mid
 * @author wtychn
 * @Date 2021/8/22
 */
public class Tencent_822_3 {
    private void solution(int[] nums, int w) {
        Arrays.sort(nums);
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for (int num : nums) {
            if(num % 2 == 0) evens.add(num);
            else odds.add(num);
        }
        int res = 0;
        res = getRes(w, odds, res);
        res = getRes(w, evens, res);
        System.out.println(res);
    }

    private int getRes(int w, List<Integer> nums, int res) {
        int l = 0, r = nums.size() - 1;
        while (l < r) {
            int sum = nums.get(l) + nums.get(r);
            if (sum <= w) {
                l++;
            }
            r--;
            res++;
        }
        res += l == r ? 1 : 0;
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        Tencent_822_3 main = new Tencent_822_3();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt(), w = s.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = s.nextInt();
            }
            main.solution(nums, w);
        }
    }
}
