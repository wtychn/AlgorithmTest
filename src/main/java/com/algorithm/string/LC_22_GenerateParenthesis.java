package com.algorithm.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: AlgorithmTest
 * @description: lc22
 * @author: Mr.Wang
 * @create: 2020-08-13 15:17
 **/
public class LC_22_GenerateParenthesis {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return res;
        }

        dfs("", 0, 0, n);

        return res;
    }

    public void dfs(String result, int leftCount, int rightCount, int sum) {
        if (leftCount == rightCount && leftCount == sum) {
            res.add(result);
            return;
        }
        if (rightCount > leftCount) {
            return;
        }
        if (leftCount < sum) {
            dfs(result + "(", leftCount + 1, rightCount, sum);
        }
        if (rightCount < sum) {
            dfs(result + ")", leftCount, rightCount + 1, sum);
        }
    }
}
