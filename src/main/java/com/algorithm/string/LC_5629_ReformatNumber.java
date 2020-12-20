package com.algorithm.string;

import java.util.ArrayList;
import java.util.List;
/***
 * @Description: 格式化字符串  
 * @level easy 
 * @author wtychn
 * @Date 2020/12/20
 */
public class LC_5629_ReformatNumber {
    public String reformatNumber(String number) {
        List<Character> characterList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c != ' ' && c != '-') {
                characterList.add(c);
                count++;
            }
            if (count == 3) {
                characterList.add('-');
                count = 0;
            }
        }
        int lineIndex = characterList.lastIndexOf('-');
        if (lineIndex == characterList.size() - 2) {
            characterList.remove(lineIndex);
            characterList.add(lineIndex - 1, '-');
        }
        if(lineIndex == characterList.size() - 1) characterList.remove(lineIndex);
        StringBuilder sb = new StringBuilder();
        for (Character c : characterList) {
            sb.append(c);
        }
        return sb.toString();
    }
}
