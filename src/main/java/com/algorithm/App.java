package com.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (i < 4 && i > 1) {
                integerList.add(null);
            } else {
                integerList.add(i);
            }
        }
        System.out.println(integerList.toString());
    }
}
