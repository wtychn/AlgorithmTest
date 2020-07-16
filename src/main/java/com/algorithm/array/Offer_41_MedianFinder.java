package com.algorithm.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Offer_41_MedianFinder {
    List<Integer> integerList;
    public Offer_41_MedianFinder() {
        integerList = new ArrayList<>();
    }

    public void addNum(int num) {
        integerList.add(num);
    }

    public double findMedian() {
        Collections.sort(integerList);
        int size = integerList.size();
        int medianIndex = size / 2;
        if (size % 2 == 0) {
            double median1 = integerList.get(medianIndex - 1);
            double median2 = integerList.get(medianIndex);
            return (median1 + median2) / 2;
        } else {
            return (double) integerList.get(medianIndex);
        }
    }
}
