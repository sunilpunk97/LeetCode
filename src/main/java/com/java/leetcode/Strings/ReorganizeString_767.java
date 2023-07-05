package com.java.leetcode.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class ReorganizeString_767 {
    public String reorganizeString(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()){    //We are traversing through all the chars of the string and counting the occurence of each chars and mapping respectively
            counts.put(c, counts.getOrDefault(c,0)+1); //the counts of the indiviual chars
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> counts.get(b)- counts.get(a));
        for(char c: counts.keySet()){
            maxHeap.add(c); //We are declaring a priority queue and then pushing the chars AKA the keys of the counts hashmap
        }
        //The idea is to remove the top two highest occuring elements and add it to our string builder, then we decrement their counts by one from the hashmap.
        StringBuilder result = new StringBuilder();
        while (maxHeap.size()>1){
            char curr = maxHeap.remove();
            char next = maxHeap.remove();
            result.append(curr);
            result.append(next);
            counts.put(curr, counts.get(curr)-1);//decrementing the char counts
            counts.put(next, counts.get(next)-1);
            if(counts.get(curr)>0)//Until we get a particular char count to zero we again add it  to our heap to repeat the same process,
                maxHeap.add(curr);
            if(counts.get(next)>0)
                maxHeap.add(next);
        }
        if(!maxHeap.isEmpty()){
            char last = maxHeap.remove();// if we have last character left and has more thaan one occurence, then we dont have any other chars to split it then we just return ""
            if(counts.get(last)>1)
                return "";
            result.append(last);//else we append it as usual;
        }
        return  result.toString();
    }
}
