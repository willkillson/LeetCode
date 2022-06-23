package com.will.arraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


class ProductOfArrayExceptSelf {

    /**
     * Solution uses O(2n) space complexity
     * O(n) time complexity
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        //calculate prefix
        prefix[0] = nums[0];
        for(int i = 1;i< nums.length;i++){
            prefix[i] = prefix[i-1]*nums[i];
        }

        //calculate postfix
        postfix[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            postfix[i] = postfix[i+1]*nums[i];
        }

        //calculate the output in nums
        for(int i = 0;i< nums.length;i++){
            //edge cases 0 and nums.length-1
            if(i==0){
                nums[i] = postfix[i+1];

            }else if(i==nums.length-1){
                nums[i] = prefix[i-1];
            }else{
                nums[i] = prefix[i-1]*postfix[i+1];
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1,2,3,4});
    }
}
