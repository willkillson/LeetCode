package com.will.arraysAndHashing;


import java.util.*;

//https://leetcode.com/problems/group-anagrams/

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0;i< strs.length;i++){
            char[] ca = new char[26];
            for(int j = 0;j<strs[i].length();j++){
                ca[strs[i].charAt(j) - 'a']++;
            }
            String hash = new String(ca);
            map.computeIfAbsent(hash,k-> new ArrayList<>());
            map.get(hash).add(strs[i]);
        }
        ret.addAll(map.values());
        return ret;
    }

    public static void main(String[] args) {
        List<List<String>> answer = new GroupAnagrams().groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}