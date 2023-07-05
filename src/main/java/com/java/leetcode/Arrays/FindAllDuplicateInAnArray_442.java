package com.java.leetcode.Arrays;

import java.util.*;

public class FindAllDuplicateInAnArray_442 {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();//We just loop through the elements and add only unique elements to the hashset. If we find the same element
        List<Integer> res = new ArrayList<>();  //again,we add it to the result list. That is, only duplicate elemets are returned via the res List that we declared.
        for(int elem:nums){
            if(!mySet.contains(elem))
                mySet.add(elem);
            else
                res.add(elem);
        }
        return res;
    }
}
