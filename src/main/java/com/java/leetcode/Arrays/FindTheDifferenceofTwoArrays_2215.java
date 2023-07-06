package com.java.leetcode.Arrays;
import java.util.*;

public class FindTheDifferenceofTwoArrays_2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> diffSet1 = new HashSet<>(set1);
        Set<Integer> diffSet2 = new HashSet<>(set2);

        diffSet1.removeAll(set2);
        diffSet2.removeAll(set1);

        List<Integer> list1 = new ArrayList<>(diffSet1);
        List<Integer> list2 = new ArrayList<>(diffSet2);

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);

        return answer;
    }
}

//    We create two HashSet objects called set1 and set2 to store the distinct integers from nums1 and nums2, respectively.
//
//        We iterate through nums1 and add each element to set1.
//
//        We iterate through nums2 and add each element to set2.
//
//        We create two additional HashSet objects called diffSet1 and diffSet2, which are copies of set1 and set2, respectively.
//
//        We use the removeAll method to find the symmetric difference between diffSet1 and set2, which gives us the distinct integers in nums1 that are not present in nums2. Similarly, we find the distinct integers in nums2 that are not present in nums1.
//
//        We create two ArrayList objects called list1 and list2 to store the distinct integers from diffSet1 and diffSet2, respectively.
//
//        We create a List called answer to store the two lists: list1 and list2.
//
//        We add list1 and list2 to answer.
//
//        Finally, we return answer, which contains the distinct integers in nums1 not present in nums2 and vice versa.
