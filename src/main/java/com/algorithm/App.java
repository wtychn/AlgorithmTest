package com.algorithm;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            int sCount = Integer.parseInt(sc.nextLine());
            String seat = sc.nextLine();
            int pCount = Integer.parseInt(sc.nextLine());
            String p = sc.nextLine();
            TreeSet<Integer> set0 = new TreeSet<>();
            TreeSet<Integer> set1 = new TreeSet<>();

            for (int j = 0; j < sCount; j++) {
                if (seat.charAt(j) == '0')
                    set0.add(j);
                else if (seat.charAt(j) == '1')
                    set1.add(j);
            }

            for (int k = 0; k < pCount; k++) {
                if (p.charAt(k) == 'F') {
                    if (!set0.isEmpty()) {
                        int index = set0.pollFirst();
                        System.out.println(index + 1);
                        set1.add(index);
                    } else
                        System.out.println(set1.pollFirst() + 1);
                } else {
                    if (!set1.isEmpty()) {
                        System.out.println(set1.pollFirst() + 1);
                    } else {
                        int index = set0.pollFirst();
                        System.out.println(index + 1);
                        set1.add(index);
                    }
                }
            }
        }
    }
}
