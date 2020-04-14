package com.algorithm.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer_5_ReplaceSpace {
    public String replaceSpace(String s) {
        String[] strings = s.split(" ");
        StringBuffer stringBuffer = new StringBuffer(strings[0]);
        for (int i = 0; i < strings.length - 1; i++) {
            stringBuffer.append("%20");
            stringBuffer.append(strings[i + 1]);
        }
        return new String(stringBuffer);
    }
}
