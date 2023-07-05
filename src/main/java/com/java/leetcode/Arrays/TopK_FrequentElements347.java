package com.java.leetcode.Arrays;
import java.util.*;

public class TopK_FrequentElements347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.get(i)==null?1:map.get(i)+1); //initializing a hash map and pushng the element as key and count as value.
        }

        PriorityQueue<Integer> heap =
                new PriorityQueue<Integer>((n1, n2) -> map.get(n1) - map.get(n2)); //this queue will contain the most freq element pushed at the bottom

        for (int n: map.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();   //to give k most freq elemet, while size is greater than k we remove those elements.
        }

        int[] top_k =new int[heap.size()];
        int i=heap.size()-1; ///then pushing it into our array.
        while (!heap.isEmpty())
            top_k[i--]=heap.poll();
        return top_k;
    }
}
