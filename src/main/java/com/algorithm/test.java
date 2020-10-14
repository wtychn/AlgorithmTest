package com.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class test {
    int max = 0;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        List<Integer[]> taxi = new ArrayList<>();
        while (!cin.hasNext("e")) {
            int incomeofA = cin.nextInt();
            int incomeofB = cin.nextInt();
            taxi.add(new Integer[]{incomeofA, incomeofB});
        }
        test f = new test();
        f.find(taxi, 0, 0, 0, 0);
        f.find(taxi, 0, 1, 0, 0);
        System.out.println(f.max);
    }

    public void find(List<Integer[]> taxi, int i, int j, int count, int sum) {
        if(j == 0) count++;
        if(count > taxi.size() / 2) return;
        sum += taxi.get(i)[j];
        if (i == taxi.size() - 1) {
            if(count == taxi.size() / 2) max = Math.max(max, sum);
        } else {
            find(taxi, i + 1, 0, count, sum);
            find(taxi, i + 1, 1, count, sum);
        }
    }
}
