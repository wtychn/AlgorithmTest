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

    public String addStrings_Arr(String num1, String num2) {
        int[] res = new int[Math.max(num1.length(), num2.length()) + 1];
        int num1Index = num1.length() - 1, num2Index = num2.length() - 1, resIndex = res.length - 1;
        while (num1Index >= 0 && num2Index >= 0) {
            int sum = res[resIndex] + num1.charAt(num1Index) + num2.charAt(num2Index) - 2 * '0';
            res[resIndex] = sum % 10;
            res[resIndex - 1] += sum / 10;
            num1Index--;
            num2Index--;
            resIndex--;
        }
        while (num1Index >= 0 || num2Index >= 0) {
            int sum;
            if (num1Index >= 0) {
                sum = res[resIndex] + num1.charAt(num1Index) - '0';
                res[resIndex] = sum % 10;
                res[resIndex - 1] += sum / 10;
                num1Index--;
            } else {
                sum = res[resIndex] + num2.charAt(num2Index) - '0';
                res[resIndex] = sum % 10;
                res[resIndex - 1] += sum / 10;
                num2Index--;
            }
            resIndex--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if(i == 0 && res[i] == 0) continue;
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
