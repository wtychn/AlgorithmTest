package com.algorithm.hash;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC_554_LeastBricksTest {
    //    [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
    @Test
    public void leastBricks() {
        LC_554_LeastBricks l = new LC_554_LeastBricks();
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(new ArrayList<>(Arrays.asList(1, 2, 2, 1)));
        wall.add(new ArrayList<>(Arrays.asList(3, 1, 2)));
        wall.add(new ArrayList<>(Arrays.asList(1, 3, 2)));
        wall.add(new ArrayList<>(Arrays.asList(2, 4)));
        wall.add(new ArrayList<>(Arrays.asList(3, 1, 2)));
        wall.add(new ArrayList<>(Arrays.asList(1, 3, 1, 1)));
        System.out.println(l.leastBricks(wall));
    }
}