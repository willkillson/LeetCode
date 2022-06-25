package com.will.twoPointers;


class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {

        int[] ret = new int[2];

        int l = 0;
        int r = numbers.length-1;

        while(l<r){
            if(numbers[l]+numbers[r]>target){
                r--;
            }else if(numbers[l]+numbers[r]<target){
                l++;
            }else if(numbers[l]+numbers[r]==target){
                ret[0] = l+1;
                ret[1] = r+1;
                return ret;
            }
        }
        return ret;

    }

//    public static void main(String[] args) {
//        new TwoSumII().twoSum("race a car");
//    }
}
