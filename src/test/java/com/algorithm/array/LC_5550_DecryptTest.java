package com.algorithm.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LC_5550_DecryptTest {

    @Test
    public void decrypt() {
        LC_5550_Decrypt d = new LC_5550_Decrypt();
        System.out.println(Arrays.toString(d.decrypt(new int[]{2, 4, 9, 3}, -2)));
    }
}