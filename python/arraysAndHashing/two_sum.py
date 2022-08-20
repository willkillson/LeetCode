class Solution:
    def twoSum(self, nums, target):
        # map value -> index
        meep = {}
        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in meep.keys():
                return [i,meep[diff]];
            meep[nums[i]] = i

        return [0,0]

nums = [2,7,11,15] 
target = 9
    
solution = Solution()

ans = solution.twoSum(nums, target)
print(ans)