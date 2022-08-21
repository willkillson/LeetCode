import math


class Solution:
    def search(self, nums, target):
        l = 0;
        r = len(nums) - 1;
        
        while l <= r:
            m = math.floor((r + l)/2);
            if target > nums[m]:
                l = m + 1 ;
            elif target < nums[m]:
                r = m - 1; 
            else:
                return m;     
        return -1;

nums = [-1,0,3,5,9,12]
target = 2

s = Solution();
ans = s.search(nums, target);

print(ans)