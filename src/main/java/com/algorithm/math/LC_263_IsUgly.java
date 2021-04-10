package com.algorithm.math;
/***
 * @Description: 丑数  
 * @level easy 
 * @author wtychn
 * @Date 2021/4/10
 */
public class LC_263_IsUgly {
    public boolean isUgly(int n) {
        if (n == 1) return true;
        if (n == 0 || (n % 2 != 0 && n % 3 != 0 && n % 5 != 0)) {
            return false;
        } else {
            if(n % 2 == 0) return isUgly(n / 2);
            if(n % 3 == 0) return isUgly(n / 3);
            return isUgly(n / 5);
        }
    }
}
