package com.algorithm.graph;

import java.util.*;
/***
 * @Description: 查找有向图的环和孤立元素  
 * @level mid 
 * @author wtychn
 * @Date 2021/4/21
 */
public class HW_421_2 {
    private int solution(int[][] nums, int m) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 10;
        Set<Integer> set = new HashSet<>();

        for (int[] num : nums) {
            set.add(num[0]);
            set.add(num[1]);
            map.put(num[0], num[1]);
        }
        Set<Integer> isVisited = new HashSet<>();
        for (Integer num : set) {
            if(isVisited.contains(num)) break;
            int father = map.get(num);
            isVisited.add(num);
            while (map.containsKey(father)) {
                isVisited.add(father);
                if (isVisited.contains(father)) {
                    res -= 2;
                    break;
                }
                father = map.get(father);
            }
        }
        res -= m - set.size();
        return Math.max(res, 0);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = s.nextInt();
            nums[i][1] = s.nextInt();
        }

        HW_421_2 h = new HW_421_2();
        System.out.println(h.solution(nums, m));
    }

}
