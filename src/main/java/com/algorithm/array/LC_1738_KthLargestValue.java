package com.algorithm.array;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
/***
 * @Description: 找出第 K 大的异或坐标值
 * @level mid
 * @author wtychn
 * @Date 2021/5/19
 */
public class LC_1738_KthLargestValue {
    public int kthLargestValue(int[][] matrix, int k) {
        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(matrix[0][0]);
        for (int i = 1; i < matrix.length; i++) {
            matrix[i][0] = matrix[i - 1][0] ^ matrix[i][0];
            priorityQueue.add(matrix[i][0]);
        }
        for (int i = 1; i < matrix[0].length; i++) {
            matrix[0][i] = matrix[0][i - 1] ^ matrix[0][i];
            priorityQueue.add(matrix[0][i]);
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] = matrix[i - 1][j] ^ matrix[i][j - 1] ^ matrix[i - 1][j - 1];
                priorityQueue.add(matrix[i][j]);
            }
        }
        for (int i = 0; i < k - 1; i++) {
            priorityQueue.poll();
        }
        return priorityQueue.poll();
    }
}
