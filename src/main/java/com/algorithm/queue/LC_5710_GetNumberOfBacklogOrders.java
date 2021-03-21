package com.algorithm.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
/***
 * @Description: 积压订单中的订单总数  
 * @level mid 
 * @author wtychn
 * @Date 2021/3/22
 */
public class LC_5710_GetNumberOfBacklogOrders {
    public int getNumberOfBacklogOrders(int[][] orders) {
        Queue<Integer[]> sell = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        Queue<Integer[]> buy = new PriorityQueue<>((o1, o2) -> o2[0] - o1[0]);
        long sum = 0;
        // 0 - buy
        // 1 - sell
        // orders[i] = [pricei, amounti, orderTypei]
        for (int[] order : orders) {
            if (order[2] == 0) {
                if (sell.isEmpty() || sell.peek()[0] > order[0]) {
                    buy.add(new Integer[]{order[0], order[1]});
                    sum += order[1];
                } else {
                    while (!sell.isEmpty() && sell.peek()[0] <= order[0] && order[1] > 0) {
                        if (sell.peek()[1] <= order[1]) {
                            sum -= sell.peek()[1];
                            order[1] -= sell.poll()[1];
                        } else {
                            sum -= order[1];
                            sell.peek()[1] -= order[1];
                            order[1] = 0;
                        }
                    }
                    if (order[1] > 0) {
                        buy.add(new Integer[]{order[0], order[1]});
                        sum += order[1];
                    }
                }
            } else {
                if (buy.isEmpty() || buy.peek()[0] < order[0]) {
                    sell.add(new Integer[]{order[0], order[1]});
                    sum += order[1];
                } else {
                    while (!buy.isEmpty() && buy.peek()[0] >= order[0] && order[1] > 0) {
                        if (buy.peek()[1] <= order[1]) {
                            sum -= buy.peek()[1];
                            order[1] -= buy.poll()[1];
                        } else {
                            sum -= order[1];
                            buy.peek()[1] -= order[1];
                            order[1] = 0;
                        }
                    }
                    if (order[1] > 0) {
                        sell.add(new Integer[]{order[0], order[1]});
                        sum += order[1];
                    }
                }
            }
        }
        return (int) (sum % 1000000007);
    }
}
