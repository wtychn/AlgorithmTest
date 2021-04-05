package com.algorithm.math;
/***
 * @Description: 乐团站位  
 * @level easy 
 * @author wtychn
 * @Date 2021/4/5
 */
public class LCSPring_2_OrchestraLayout {
    public int orchestraLayout(int num, int xPos, int yPos) {
        int x = xPos + 1, y = yPos + 1;
        long q = Math.min(Math.min(x, y), Math.min(num - x + 1, num - y + 1));
        long index;
        if (x == y && y == q) {
            index = 1;
        } else if (y > x) { //上半部分
            index = y + x - 2L * q + 1;
        } else { //下半部分
            index = 4 * (num - 2L * q + 1) - (x + y - 2L * q) + 1;
        }
        long count = 2 * ((num - 1) + (num - 2L * (q - 1) + 1)) * (q - 1) + index;
        return (int) (count % 9);
    }
}
