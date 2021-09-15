package com.algorithm.string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class LC_524_FindLongestWordTest {

    @Test
    public void findLongestWord() {
        LC_524_FindLongestWord f = new LC_524_FindLongestWord();
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aa");
        list.add("a");
        System.out.println(f.findLongestWord("aaa", list));
    }
}