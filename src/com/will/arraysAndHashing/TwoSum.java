package com.will.arraysAndHashing;


import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
//        //Brute force O(N^2)
//        for(int i = 0;i< nums.length;i++){
//            int a = nums[i];
//            for(int j = i+1;j<nums.length;j++){
//                int b = nums[j];
//                if(a+b==target){
//                    int[] ret = new int[2];
//                    ret[0] = i;
//                    ret[1] = j;
//                    return ret;
//                }
//
//            }
//        }
//        return new int[2];

        // O(N)
        HashMap<Integer, Integer> valToIndex = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            int diff = target - nums[i];
            if(valToIndex.containsKey(diff)){
                return new int[]{i,valToIndex.get(diff)};
            }else{
                valToIndex.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] answer = new TwoSum().twoSum(new int[]{2,7,11,15}, 9);
    }
}