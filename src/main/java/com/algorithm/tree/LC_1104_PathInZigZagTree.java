package com.algorithm.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/***
 * @Description: 二叉树寻路
 * @level mid
 * @author wtychn
 * @Date 2021/7/29
 */
public class LC_1104_PathInZigZagTree {
    // 在每一行都从左到右排列的二叉树中：
    // 1. 根节点位于第 1 行；
    // 2. 第 i 行有 2 ^ (i - 1) 个节点，最左边的节点标号为 2 ^ (i - 1),
    //    最右边节点标号为 2 ^ i - 1
    // 3. 标号为 val 的结点左子节点为 2 * val，右子节点为 2 * val + 1，
    //    父节点标号为 val / 2
    // 因此可以从目标节点向上求子节点得到路径
    public List<Integer> pathInZigZagTree(int label) {
        int row = 1, rowStart = 1;
        while (rowStart * 2 <= label) {
            row++;
            rowStart *= 2;
        }
        if (row % 2 == 0) {
            label = getReverse(label, row);
        }
        List<Integer> path = new ArrayList<>();
        while (row > 0) {
            if (row % 2 == 0) {
                path.add(getReverse(label, row));
            } else {
                path.add(label);
            }
            row--;
            label >>= 1;
        }
        Collections.reverse(path);
        return path;
    }
    // 偶数行反转公式为 reverse = 2 ^ (row - 1) + 2 ^ row - 1 - label
    private int getReverse(int label, int row) {
        return (1 << row - 1) + (1 << row) - 1 - label;
    }
}
