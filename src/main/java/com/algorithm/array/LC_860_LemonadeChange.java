package com.algorithm.array;

import javax.swing.text.StyledEditorKit;
/***
 * @Description: 柠檬水找零
 * @level easy
 * @author wtychn
 * @Date 2020/12/10
 */
public class LC_860_LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        for (int bill : bills) {
            switch (bill){
                case 5:
                    five++;
                    break;
                case 10:
                    ten++;
                    if (five != 0) five--;
                    else return false;
                    break;
                case 20:
                    twenty++;
                    if (ten != 0) {
                        if (five != 0) {
                            five--;
                            ten--;
                        } else {
                            return false;
                        }
                    } else if (five >= 3) {
                        five -= 3;
                    } else {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return true;
    }
}
