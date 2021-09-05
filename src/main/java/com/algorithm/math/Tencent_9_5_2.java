package com.algorithm.math;

import java.util.Arrays;
import java.util.Scanner;
/***
 * @Description: 因数数目 & 田忌赛马
 * @level mid
 * @author wtychn
 * @Date 2021/9/5
 */
public class Tencent_9_5_2 {
    private int solution(int[] aPets, int[] bPets, int n) {
        int[] aScore = new int[n];
        int[] bScore = new int[n];
        for (int i = 0; i < n; i++) {
            aScore[i] = factors(aPets[i]);
            bScore[i] = factors(bPets[i]);
        }
        Arrays.sort(aScore);
        Arrays.sort(bScore);
        int al = 0, bl = 0, ar = n - 1, br = n - 1;
        int count = 0;
        while (al <= ar) {
            if (aScore[ar] > bScore[br]) {
                ar--;
                br--;
                count++;
            } else if (aScore[al] > bScore[bl]) {
                al++;
                bl++;
                count++;
            } else {
                count += aScore[al] > bScore[br] ? 1 : 0;
                al++;
                br--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] aPets = new int[n];
        int[] bPets = new int[n];
        for (int i = 0; i < n; i++) {
            aPets[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bPets[i] = s.nextInt();
        }

        Tencent_9_5_2 main = new Tencent_9_5_2();
        System.out.println(main.solution(aPets, bPets, n));
    }

    private int factors(int n) {
        if (n == 0) return 0;
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += n / i == i ? 1 : 2;
            }
        }
        return count;
    }
}
