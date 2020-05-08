package com.algorithm.search;

import java.util.ArrayList;
import java.util.List;

public class LC_386_SortByLexicalOrder {
    List<Integer> res = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        orderByDFS(0, n, 0);
        return res;
    }

    private void orderByDFS(int current, int max, int digits) {
        if (current > max) {
            return;
        }
        if (current > 0) {
            res.add(current);
        }
        //for循环里使用 ?表达式节省了一个if,使代码更加简洁
        for (int i = digits > 0 ? 0 : 1; i < 10; i++) {
            orderByDFS(current * 10 + i, max, digits + 1);
        }
    }
}
