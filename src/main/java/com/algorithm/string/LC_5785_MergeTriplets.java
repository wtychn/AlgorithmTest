package com.algorithm.string;
/***
 * @Description: 合并若干三元组以形成目标三元组
 * @level mid
 * @author wtychn
 * @Date 2021/6/13
 */
public class LC_5785_MergeTriplets {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int x = 0, y = 0, z = 0;
        for (int[] triplet : triplets) {
            int x1 = triplet[0], y1 = triplet[1], z1 = triplet[2];
            //判断该三元组是否可用用来合成
            if (x1 <= target[0] && y1 <= target[1] && z1 <= target[2]) {
                x = Math.max(x, x1);
                y = Math.max(y, y1);
                z = Math.max(z, z1);
            }
        }
        return (x == target[0]) && (y == target[1]) && (z == target[2]);
    }
}
