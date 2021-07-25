package com.algorithm.search;

/***
 * @Description: 最大兼容性评分和
 * @level mid
 * @author wtychn
 * @Date 2021/7/25
 */
public class LC_5825_MaxCompatibilitySum {
    int max, m;
    int[][] students;
    int[][] mentors;
    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        max = 0;
        m = students[0].length;
        this.students = students;
        this.mentors = mentors;
        recur(new boolean[mentors.length], 0, 0);
        return max;
    }

    private void recur(boolean[] isVisited, int sum, int curIdx) {
        if (curIdx == isVisited.length) {
            max = Math.max(sum, max);
            return;
        }
        for (int i = 0; i < isVisited.length; i++) {
            if(isVisited[i]) continue;
            int curScore = score(students[curIdx], mentors[i]);
            isVisited[i] = true;
            recur(isVisited, sum + curScore, curIdx + 1);
            isVisited[i] = false;
        }
    }

    private int score(int[] student, int[] mentor) {
        int res = 0;
        for (int i = 0; i < student.length; i++) {
            res += student[i] == mentor[i] ? 1 : 0;
        }
        return res;
    }
}
