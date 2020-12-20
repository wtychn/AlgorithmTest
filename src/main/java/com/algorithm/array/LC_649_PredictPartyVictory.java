package com.algorithm.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/***
 * @Description: 议会决议
 * @level mid
 * @author wtychn
 * @Date 2020/12/12
 */
public class LC_649_PredictPartyVictory {
    public String predictPartyVictory(String senate) {
        List<Character> characters = new ArrayList<>();
        int[] freq = new int[2];
        for (char c : senate.toCharArray()) {
            characters.add(c);
            if(c == 'R') freq[0]++;
            else freq[1]++;
        }
        int cur = 0, next;
        while (freq[0] != 0 && freq[1] != 0) {
            cur = cur % characters.size();
            next = cur + 1;
            if (characters.get(cur) == 'R') {
                while (characters.get(next % characters.size()) != 'D') {
                    next++;
                }
                freq[1]--;
            } else {
                while (characters.get(next % characters.size()) != 'R') {
                    next++;
                }
                freq[0]--;
            }
            if(next % characters.size() > cur) cur++;
            characters.remove(next % characters.size());
        }
        return freq[1] == 0 ? "Radiant" : "Dire";
    }

    public String predictPartyVictory_twoQueue(String senate) {
        int n = senate.length();
        Queue<Integer> rIndex = new LinkedList<>();
        Queue<Integer> dIndex = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char c = senate.charAt(i);
            if (c == 'R') {
                rIndex.add(i);
            } else {
                dIndex.add(i);
            }
        }
        while (!rIndex.isEmpty() && !dIndex.isEmpty()) {
            int r = rIndex.poll(), d = dIndex.poll();
            if (r < d) {
                rIndex.add(d + n);
            } else {
                dIndex.add(r + n);
            }
        }
        return rIndex.isEmpty() ? "Dire" : "Radiant";
    }
}
