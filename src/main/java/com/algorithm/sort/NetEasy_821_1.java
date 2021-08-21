package com.algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

/***
 * @Description: 数组中两元素和小于等于 m 的组合数
 * @level easy
 * @author wtychn
 * @Date 2021/8/21
 */
public class NetEasy_821_1 {

    private int solution(int[] nums, int m) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        int res = 0;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum > m) {
                r--;
            } else {
                res += r - l;
                l++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nums = s.nextLine().split(" ");
        int m = s.nextInt();
        int[] numArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numArray[i] = Integer.parseInt(nums[i]);
        }

        NetEasy_821_1 main = new NetEasy_821_1();
        System.out.println(main.solution(numArray, m));
    }
}
