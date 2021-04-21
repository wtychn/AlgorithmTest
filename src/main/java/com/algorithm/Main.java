package com.algorithm;

import java.util.*;

public class Main {
    int[] nums;
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> solution(int[] nums) {
        this.nums = nums;
        boolean[] isVisited = new boolean[nums.length];
        Arrays.fill(isVisited, false);
        dfs(new ArrayList<Integer>(), isVisited);
        return res;
    }

    private void dfs(List<Integer> cur, boolean[] isVisited) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
        }
        for (int j = 0; j < nums.length; j++) {
            if (!isVisited[j]) {
                cur.add(nums[j]);
                isVisited[j] = true;
                dfs(cur, isVisited);
                cur.remove(cur.size() - 1);
                isVisited[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    }
}



