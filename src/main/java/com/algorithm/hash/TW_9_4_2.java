package com.algorithm.hash;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/***
 * @Description: 计票器
 * @level easy
 * @author wtychn
 * @Date 2021/9/4
 */
public class TW_9_4_2 {
    public static String countVotes(List<String> validCandidates, List<String> voteCasted) {
        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String s : validCandidates) {
            freq.put(s, 0);
        }
        int invalidVotes = 0, max = 0;
        String winner = "";
        for (String s : voteCasted) {
            if (freq.containsKey(s)) {
                freq.put(s, freq.get(s) + 1);
            } else {
                invalidVotes++;
            }
        }
        String res = "";
        for(Map.Entry<String, Integer> entry : freq.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            res += key + "=" + val + " ";
            if (val > max) {
                max = val;
                winner = key;
            }
        }
        res += "invalidVotes=" + invalidVotes + " ";
        if (invalidVotes > max || invalidVotes == 0) {
            res += "Winner=N/A";
        } else {
            res += "Winner=" + winner;
        }
        return res;
    }
}
