package com.algorithm.prefix;

/***
 * @Description: 航班预定统计
 * @level mid
 * @author wtychn
 * @Date 2021/8/31
 */
public class LC_1109_CorpFlightBookings {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n];
        for (int[] booking : bookings) {
            diff[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                diff[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }
        return diff;
    }
}
