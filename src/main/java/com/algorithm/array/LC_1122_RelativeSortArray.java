package com.algorithm.array;

import java.util.*;

public class LC_1122_RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> count = new HashMap<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> sortList = new ArrayList<>();
        for (int a : arr2) {
            set2.add(a);
        }
        for (int a : arr1) {
            if (set2.contains(a)) {
                if (count.containsKey(a)) {
                    count.put(a, count.get(a) + 1);
                } else {
                    count.put(a, 1);
                }
            } else {
                sortList.add(a);
            } 
        }

        int[] res = new int[arr1.length];
        int index1 = 0;
        Collections.sort(sortList);
        for (int k : arr2) {
            for (int j = 0; j < count.get(k); j++) {
                res[index1] = k;
                index1++;
            }
        }
        for (Integer integer : sortList) {
            res[index1] = integer;
            index1++;
        }
        return res;
    }

    public int[] relativeSortArray_CountSort(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        int[] res = new int[arr1.length];
        for (int a1 : arr1) {
            freq[a1]++;
        }
        int index = 0;
        for (int a2 : arr2) {
            int freqTemp = freq[a2];
            for (int i = 0; i < freqTemp; i++) {
                res[index++] = a2;
                freq[a2]--;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                res[index++] = i;
            }
        }
        return res;
    }
}
