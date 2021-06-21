package com.algorithm.string;

import java.util.Scanner;
/***
 * @Description: 数字中含有 7 或者能被 7 整除
 * @level easy
 * @author wtychn
 * @Date 2021/6/17
 */
public class Vivo_617_1 {
    public boolean solution(String str) {
        if(Integer.parseInt(str) % 7 == 0) return true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '7') return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] strings = str.split(" ");

        Vivo_617_1 main = new Vivo_617_1();
        int count = 0;
        for (String string : strings) {
            count += main.solution(string) ? 1 : 0;
        }
        System.out.println(count);
    }
}
