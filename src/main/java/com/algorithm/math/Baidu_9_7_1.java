package com.algorithm.math;

import java.util.Scanner;

/***
 * @Description: 像素放大
 * @level easy
 * @author wtychn
 * @Date 2021/9/7
 */
public class Baidu_9_7_1 {
    private int[][] solution(int[][] matrix, int n, int k) {
        int[][] res = new int[n * k][n * k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    for (int l = i * k; l < i * k + k; l++) {
                        for (int m = j * k; m < j * k + k; m++) {
                            res[l][m] = matrix[i][j];
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        Baidu_9_7_1 main = new Baidu_9_7_1();
        int[][] res = main.solution(matrix, n, k);
        for (int[] re : res) {
            for (int j = 0; j < res[0].length - 1; j++) {
                System.out.print(re[j] + " ");
            }
            System.out.println(re[res[0].length - 1]);
        }
    }
}
