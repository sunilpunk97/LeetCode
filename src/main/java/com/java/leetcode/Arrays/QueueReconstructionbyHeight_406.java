package com.java.leetcode.Arrays;
import java.util.*;

public class QueueReconstructionbyHeight_406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        // both arraylist and linkedlist works
        List<int[]> list = new ArrayList<>();
        for (int[] person : people) {

            list.add(person[1], person);
        }
        return list.toArray(new int[list.size()][]);
    }
}
