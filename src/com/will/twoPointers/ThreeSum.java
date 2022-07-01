package com.will.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<Integer> list = new ArrayList<>();
        list.add(3,1337);

        List<List<Integer>> ret = new ArrayList<>();

        // First sort nums
        Arrays.sort(nums);
        //Use easy number as a first value
        for(int i = 0;i < nums.length;i++){

            // Skip something if it is the same as the prev (no duplicates)
            if(i>0 && nums[i] ==nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int threeSum = nums[i] + nums[l]+nums[r];
                if(threeSum >0){
                    r--;
                }else if(threeSum<0){
                    l++;
                }
                else{
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[l]);
                    res.add(nums[r]);
                    ret.add(res);
                    // Move left pointer skipping duplicates
                    l++;
                    while(nums[l]==nums[l-1] && l<r){
                        l++;
                    }
                }
            }
        }
        return ret;
    }


    public static void main(String[] args) {
        List<List<Integer>> answer = new ThreeSum().threeSum(new int[]{-2,-2,0,0,2,2});
        System.out.println(answer);
    }
}
