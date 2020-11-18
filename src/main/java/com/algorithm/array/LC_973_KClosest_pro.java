package com.algorithm.array;

import java.util.Arrays;
/***
 * @Description: 最接近原点的 K 个点(快排取前 k 个)
 * @level mid
 * @author wtychn
 * @Date 2020/11/10
 */
public class LC_973_KClosest_pro {
    public int[][] kClosest(int[][] points, int K) {
        return quickSort(points, 0, points.length - 1, K);
    }

    private int[][] quickSort(int[][] array, int l, int r, int k) {
        if (l <= r) {
            int pivot = partition(array, l, r);
            if(pivot == k - 1) return Arrays.copyOf(array, k);
            return pivot > k - 1 ? quickSort(array, l, pivot - 1, k)
                    : quickSort(array, pivot + 1, r, k);
        }
        return new int[0][0];
    }

    private int partition(int[][] array, int l, int r) {
        int index = l + 1;
        int pivot = l;
        for (int i = index; i <= r; i++) {
            if (distance(array[i]) < distance(array[pivot])) {
                swap(array, i, index);
                index++;
            }
        }
        swap(array, index - 1, pivot);
        return index - 1;
    }

    private void swap(int[][] array, int a, int b) {
        int[] tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    private int distance(int[] loc) {
        return loc[0] * loc[0] + loc[1] * loc[1];
    }
}
