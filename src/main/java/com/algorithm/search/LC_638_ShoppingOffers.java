package com.algorithm.search;

import java.util.*;

/***
 * @Description: 大礼包
 * @level mid
 * @author wtychn
 * @Date 2021/10/25
 */
public class LC_638_ShoppingOffers {
    Map<List<Integer>, Integer> needCost;
    int n;

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        n = needs.size();
        this.needCost = new HashMap<>();
        List<List<Integer>> filterSpecial = new ArrayList<>();
        for (List<Integer> sp : special) {
            int totalCount = 0, totalPrice = 0;
            for (int i = 0; i < n; ++i) {
                totalCount += sp.get(i);
                totalPrice += sp.get(i) * price.get(i);
            }
            if (totalCount > 0 && totalPrice > sp.get(n)) {
                filterSpecial.add(sp);
            }
        }
        return dfs(price, filterSpecial, needs);
    }

    private int dfs(List<Integer> price, List<List<Integer>> curSpecial, List<Integer> curNeeds) {
        if (!needCost.containsKey(curNeeds)) {
            int curCost = 0;
            for (int i = 0; i < n; i++) {
                curCost += curNeeds.get(i) * price.get(i);
            }
            for (List<Integer> specialPart : curSpecial) {
                List<Integer> nextNeeds = new ArrayList<>();
                int specialCost = specialPart.get(n);
                if (specialCost < curCost) {
                    for (int i = 0; i < n; i++) {
                        if (specialPart.get(i) > curNeeds.get(i)) {
                            break;
                        }
                        nextNeeds.add(curNeeds.get(i) - specialPart.get(i));
                    }
                    if (nextNeeds.size() == n) {
                        curCost = Math.min(
                                curCost,
                                dfs(price, curSpecial, nextNeeds) + specialCost
                        );
                    }
                }
            }
            needCost.put(curNeeds, curCost);
        }
        return needCost.get(curNeeds);
    }

}
