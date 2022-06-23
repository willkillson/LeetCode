package com.will.arraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixArray = new int[nums.length];
        int[] postfixArray = new int[nums.length];

        prefixArray[0] = nums[0];
        for(int i = 1;i< nums.length;i++){
            prefixArray[i] = prefixArray[i-1] * nums[i];
        }

        postfixArray[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            postfixArray[i] = postfixArray[i+1]*nums[i];
        }

        for(int i = 0;i< nums.length;i++){
                //edgecase i = 0
            if(i==0){
                nums[0] = 1 * postfixArray[1];
            }else if( i==nums.length-1){
                //edgecase i = length-2
                nums[nums.length-1] = 1 * prefixArray[i-1];
            }else{
                nums[i] = prefixArray[i-1] *postfixArray[i+1];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1,2,3,4});
    }
}
