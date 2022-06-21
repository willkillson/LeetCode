package com.will.arraysAndHashing;

import org.w3c.dom.ranges.Range;

import java.util.*;
import java.util.stream.IntStream;

//https://leetcode.com/problems/valid-anagram/submissions/
class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        // Find the frequency of each number
        // Number -> Frequency
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int n:nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }

        List<List<Integer>> frequency = new ArrayList<>();
        IntStream.range(0,nums.length+1).forEach((n)->{
            frequency.add(new ArrayList<>());
        });

        for(Map.Entry<Integer,Integer> e: count.entrySet()){
            // this key occurse this value times
            frequency.get(e.getValue()).add(e.getKey());
        }

        List<Integer> ret = new ArrayList<>();
        int j = 0;// while j<k
        for(int i = frequency.size()-1;i>=0 && j<k;i--){
            if(!frequency.get(i).isEmpty()){
                ret.addAll(frequency.get(i));
                j = j + frequency.get(i).size();
            }
        }

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
//        new TopKFrequentElements().topKFrequent(new int[]{1,1,1,2,2,3},2);
//        new TopKFrequentElements().topKFrequent(new int[]{1,2},2);
//        new TopKFrequentElements().topKFrequent(new int[]{-1,-1},1);
//        new TopKFrequentElements().topKFrequent(new int[]{1,1,7,7,7,7,7,3,3,3,4,4,4,4,4,4,4,4,4},2);
        new TopKFrequentElements().topKFrequent(new int[]{4,1,-1,2,-1,2,3},2);
    }
}
