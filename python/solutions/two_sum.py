class Solution:
    def twoSum(self, nums, target):
        print("poop")
        # Map value -> index
        myMap = {}
        for i in range(0,len(nums),1):
            difference = target - nums[i]
            if difference in myMap:
                return [i, myMap.get(difference)]
            else:
                myMap[nums[i]] = i
        return [0, 0]
    
nums = [2,7,11,15] 
target = 9
    
solution = Solution()

solution.twoSum(nums, target)