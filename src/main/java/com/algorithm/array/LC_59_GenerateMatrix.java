package com.algorithm.array;
/***
 * @Description: 螺旋矩阵2  
 * @level mid 
 * @author wtychn
 * @Date 2021/3/16
 */
public class LC_59_GenerateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int count = 1;
        while(true) {
            for(int i = l; i <= r; i++) res[t][i] = count++; // left to right.
            if(++t > b) break;
            for(int i = t; i <= b; i++) res[i][r] = count++; // top to bottom.
            if(l > --r) break;
            for(int i = r; i >= l; i--) res[b][i] = count++; // right to left.
            if(t > --b) break;
            for(int i = b; i >= t; i--) res[i][l] = count++; // bottom to top.
            if(++l > r) break;
        }
        return res;
    }
}
