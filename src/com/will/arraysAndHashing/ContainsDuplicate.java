package com.will.arraysAndHashing;

import java.util.*;

//https://leetcode.com/problems/contains-duplicate/

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        for (int i: nums) {
            if(hm.contains(i)){
                return true;
            }
            hm.add(i);
        }
        return false;
    }
}