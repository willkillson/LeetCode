package com.will.arraysAndHashing;

import org.w3c.dom.ranges.Range;

import java.util.*;
import java.util.stream.IntStream;

//https://leetcode.com/problems/top-k-frequent-elements/

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 */
class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        // Count Map Value->Frequency
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        //Order a list of values based on frequency in reverse
        List<Integer> list = new ArrayList<>(hm.keySet());
        Collections.sort(list, (n1,n2)-> hm.get(n2).compareTo(hm.get(n1)));

        //Return first k of the list
        int[] ret = new int[k];
        for(int i = 0;i< k;i++){
            ret[i] = list.get(i);
        }
        return ret;
    }

    public int[] topKFrequent2(int[] nums, int k) {
        // Find the frequency of each number
        // Number -> Frequency
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int n:nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }

        //Instantiate a list of lists from 0 to nums.length+1
        List<List<Integer>> frequency = new ArrayList<>();
        IntStream.range(0,nums.length+1).forEach((n)->{
            frequency.add(new ArrayList<>());
        });

        // assign the frequency of the index, and put in the number
        for(Map.Entry<Integer,Integer> e: count.entrySet()){
            // this key occurse this value times
            frequency.get(e.getValue()).add(e.getKey());
        }

        //Go from the end of the list and find j<k values
        // if the list is not empty, then its one of the
        // highest numbers of occurance.
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
