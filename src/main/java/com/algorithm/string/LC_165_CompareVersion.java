package com.algorithm.string;

/***
 * @Description: 比较版本号
 * @level mid
 * @author wtychn
 * @Date 2021/9/1
 */
public class LC_165_CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        for (int i = 0; i < Math.min(v1.length, v2.length); i++) {
            int v1Int = Integer.parseInt(v1[i]);
            int v2Int = Integer.parseInt(v2[i]);
            if (v1Int < v2Int) {
                return -1;
            } else if (v1Int > v2Int) {
                return 1;
            }
        }
        if (v1.length < v2.length) {
            for (int i = v1.length; i < v2.length; i++) {
                if(Integer.parseInt(v2[i]) > 0) return -1;
            }
        } else {
            for (int i = v2.length; i < v1.length; i++) {
                if(Integer.parseInt(v1[i]) > 0) return 1;
            }
        }
        return 0;
    }
}
