package com.algorithm.search;

public class Offer_13_ActivityScope {
    public int movingCount(int m, int n, int k) {
        boolean[][] table = new boolean[m][n];
        return countSum(table, 0, 0, k, 0);
    }

    private int countSum(boolean[][] table, int row, int column, int k, int count) {
        int sum = 0, r = row, c = column;
        while (r / 10 > 0) {
            sum += r % 10;
            r = r / 10;
        }
        sum += r;
        while (c / 10 > 0) {
            sum += c % 10;
            c = c / 10;
        }
        sum += c;
        if (sum > k
                || row > table.length - 1
                || column > table[0].length - 1
                || table[row][column]) {
            return count;
        }
        count++;
        table[row][column] = true;
        count = countSum(table, row + 1, column, k, count);
        count = countSum(table, row, column + 1, k, count);
        return count;
    }
}
