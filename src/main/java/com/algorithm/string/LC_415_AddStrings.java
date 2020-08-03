package com.algorithm.string;

/**
 * @program: AlgorithmTest
 * @description: lc415
 * @author: Mr.Wang
 * @create: 2020-08-03 13:37
 **/
public class LC_415_AddStrings {
    public String addStrings(String num1, String num2) {
        return num1.length() > num2.length() ? add(num1, num2) : add(num2, num1);
    }

    private String add(String longer, String shorter) {
        int cur, carry = 0;
        int longerIndex = longer.length() - 1, shorterIndex = shorter.length() - 1;
        StringBuilder result = new StringBuilder();
        while (shorterIndex >= 0) {
            cur = longer.charAt(longerIndex) + shorter.charAt(shorterIndex) - 2 * '0' + carry;
            carry = cur / 10;
            result.append(cur % 10);
            longerIndex--;
            shorterIndex--;
        }
        while (longerIndex >= 0) {
            cur = longer.charAt(longerIndex) - '0' + carry;
            carry = cur / 10;
            result.append(cur % 10);
            longerIndex--;
        }
        if(carry != 0) result.append(carry);
        return result.reverse().toString();
    }

}
