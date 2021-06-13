package com.algorithm.search;
/***
 * @Description: 第一个错误的版本
 * @level easy
 * @author wtychn
 * @Date 2021/6/13
 */
public class LC_278_FirstBadVersion {
   public int firstBadVersion(int n) {
       int l = 1, r = n;
       while (l < r) {
           // (l + r) / 2 这种写法可能会导致计算时溢出
           int m = l + (r - l) / 2;
           if(isBadVersion(m)) r = m;
           else l = m + 1;
       }
       return l;
   }

    boolean isBadVersion(int version) {
        return true;
    }
}
