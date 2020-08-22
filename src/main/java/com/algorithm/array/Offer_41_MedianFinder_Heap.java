package com.algorithm.array;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Offer_41_MedianFinder_Heap {
    Queue<Integer> A, B;
//    A是小顶堆，用来存放大数；B是大顶堆，用来存放小数
    public Offer_41_MedianFinder_Heap() {
        A = new PriorityQueue<>();
        B = new PriorityQueue<>((x, y) -> (y - x));
    }

//   当两堆不同大小时：需向B添加一个元素。实现方法：将新元素num插入至A，再将A堆顶元素插入至B；
//   当两堆大小相同时：需向A添加一个元素。实现方法：将新元素num插入至B，再将B堆顶元素插入至A；
    public void addNum(int num) {
        if (A.size() != B.size()) {
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        return A.size() == B.size() ? (A.peek() + B.peek()) / 2.0 : A.peek();
    }
}
