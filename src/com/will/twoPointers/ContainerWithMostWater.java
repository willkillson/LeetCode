package com.will.twoPointers;


class ContainerWithMostWater {

    // Brute Force O(n^2)
    public int maxArea2(int[] height) {
        int ret = 0;
        int area = 0;
        for(int i = 0;i< height.length;i++){
            for(int j = i+1;j< height.length;j++){
                area = (j-i) * Math.min(height[i],height[j]);
                ret = Math.max(area,ret);
            }
        }

        return ret;
    }

    // O(n)
    public int maxArea(int[] height) {

        int area = 0;
        int l = 0;
        int r = height.length-1;

        while(l<r){
            int cArea = (r-l) * Math.min(height[l],height[r]);
            area = Math.max(cArea,area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int answer = new ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(answer);
    }
}
