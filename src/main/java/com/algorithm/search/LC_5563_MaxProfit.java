package com.algorithm.search;

import java.util.Arrays;

public class LC_5563_MaxProfit {
    public int maxProfit(int[] inventory, int orders) {
        long val = 0;
        int n = inventory.length;
        while (orders > 0) {
            long add;
            if (inventory.length < 2) {
                long a1 = orders;
                long a2 = inventory[n - 1] + (inventory[n - 1] - orders + 1);
                add = (a1 * a2 / 2) % 1000000007;
                val = (val + add) % 1000000007;
                orders = 0;
            } else {
                Arrays.sort(inventory);
                long count = Math.min(orders, inventory[n - 1] - inventory[n - 2] + 1);
                long a1 = inventory[n - 1] + (inventory[n - 1] - count + 1);
                add = ((inventory[n - 1] + (inventory[n - 1] - count + 1)) * count / 2) % 1000000007;
                orders -= count;
                inventory[n - 1] -= count;
                val = (val + add) % 1000000007;
            }
        }
        return (int) val;
    }
}
