package com.java.leetcode.Arrays;
import java.util.*;

public class FindTheDifferenceofTwoArrays_2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Create two sets to store unique elements from nums1 and nums2
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Iterate through nums1 and add each element to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Iterate through nums2 and add each element to set2
        for (int num : nums2) {
            set2.add(num);
        }

        // Create two sets, diffSet1 and diffSet2, as copies of set1 and set2 respectively
        Set<Integer> diffSet1 = new HashSet<>(set1);
        Set<Integer> diffSet2 = new HashSet<>(set2);

        // Find the elements that are present in diffSet1 but not in set2
        diffSet1.removeAll(set2);

        // Find the elements that are present in diffSet2 but not in set1
        diffSet2.removeAll(set1);

        // Create two lists, list1 and list2, to store the differences found in diffSet1 and diffSet2 respectively
        List<Integer> list1 = new ArrayList<>(diffSet1);
        List<Integer> list2 = new ArrayList<>(diffSet2);

        // Create a list, answer, to store the final result
        List<List<Integer>> answer = new ArrayList<>();

        // Add list1 and list2 to the answer list
        answer.add(list1);
        answer.add(list2);

        // Return the answer list containing the differences found in nums1 and nums2
        return answer;
    }

}


