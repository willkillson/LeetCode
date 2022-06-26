package com.will;

public class NonDecreasingArray {


    //https://leetcode.com/problems/non-decreasing-array/
    public boolean checkPossibility(int[] nums) {

        if(nums.length==3)
            if(nums[0]==nums[1])
                if(nums[1]==nums[2])
                    return true;




        // Use two pointers,

        int l = 0;
        int r = nums.length-1;

        // allow 1 failure on l, or r where l>r
        boolean failed = false;
        while(l<r){

            if(nums[l]>=nums[r]){
                //we have a failure
                // check if we had a previous failure
                if(failed){
                    return false;
                }
                failed = true;
                l++;
            }else{
                // Everything is fine, keep checking l<r
                l++;
                r--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new NonDecreasingArray().checkPossibility(new int[]{1,5,4,6,7,10,8,9});
    }
}
