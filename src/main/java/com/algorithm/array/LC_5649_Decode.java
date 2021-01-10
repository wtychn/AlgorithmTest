package com.algorithm.array;
/***
 * @Description: 解码异或后的数组  
 * @level easy 
 * @author wtychn
 * @Date 2021/1/10
 */
public class LC_5649_Decode {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            arr[i + 1] = encoded[i] ^ arr[i];
        }
        return arr;
    }
}
