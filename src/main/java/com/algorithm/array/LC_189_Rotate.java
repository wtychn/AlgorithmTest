package com.algorithm.array;
/***
 * @Description: 旋转数组  
 * @level mid 
 * @author wtychn
 * @Date 2021/1/8
 */
public class LC_189_Rotate {
    // 复制新数组
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(res, 0, nums, 0, nums.length);
    }

    // 三次翻转
    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // 环状替代
    public void rotate3(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = gcd(k, n); //计算最大公约数
        for (int start = 0; start < count; ++start) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
            } while (start != current);
        }
    }

    public int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }
}
