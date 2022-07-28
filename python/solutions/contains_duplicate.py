

class Solution:
    def containsDuplicate(self, nums): 
        mySet = set()
        for n in nums:
            if n in mySet:
                return True
            else:
                mySet.add(n)
                
        return False
    

nums = [1,2,3,1]

solution = Solution()

print(solution.containsDuplicate(nums))