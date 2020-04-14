package com.algorithm.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer_5_ReplaceSpace {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(aChar);
            }
        }
        return stringBuilder.toString();
    }
}
