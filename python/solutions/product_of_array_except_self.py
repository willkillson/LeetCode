class Solution:
    def productExceptSelf(self, nums):
        
        # Calculate postfix array
        endIndex = len(nums)-1
        postfix = [0] * len(nums)
        postfix[endIndex] = nums[endIndex]
        for n in range(len(nums)-2,-1,-1):
            postfix[n] = nums[n] * postfix[n+1]
            # print(postfix[n])
            
        # Calculate prefix array
        prefix = [0] * len(nums)
        prefix[0] = nums[0]
        for n in range(1,len(nums),1):
            prefix[n] = nums[n] * prefix[n-1]
            # print(prefix[n])
        
        
        # aggregate the final solution
        ret = []
        for n in range(0,len(nums),1):
            if n == 0:
                v = postfix[n+1]
                ret.append(v)
            elif n==len(nums)-1:
                v = prefix[n-1]
                ret.append(v)
            else:
                v = prefix[n-1] * postfix[n+1]
                ret.append(v)
                
                
        
        return ret
    
    

s = Solution()


nums = [1,2,3,4]

# [24,12,8,6]

v  = s.productExceptSelf(nums)

print(v)