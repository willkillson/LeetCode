# class Solution:
#     def productExceptSelf(self, nums):
        
#         # Calculate postfix array
#         endIndex = len(nums)-1
#         postfix = [0] * len(nums)
#         postfix[endIndex] = nums[endIndex]
#         for n in range(len(nums)-2,-1,-1):
#             postfix[n] = nums[n] * postfix[n+1]
#             # print(postfix[n])
            
#         # Calculate prefix array
#         prefix = [0] * len(nums)
#         prefix[0] = nums[0]
#         for n in range(1,len(nums),1):
#             prefix[n] = nums[n] * prefix[n-1]
#             # print(prefix[n])
        
        
#         # aggregate the final solution
#         ret = []
#         for n in range(0,len(nums),1):
#             if n == 0:
#                 v = postfix[n+1]
#                 ret.append(v)
#             elif n==len(nums)-1:
#                 v = prefix[n-1]
#                 ret.append(v)
#             else:
#                 v = prefix[n-1] * postfix[n+1]
#                 ret.append(v)
                
#         return ret
class Solution:
    def productExceptSelf(self, nums):

        # prefix_array - [1,2,6,24]
        # postfix_array - [24,24,12,4]
        
        # beg edge case = [postfix_array[1]]
        # end edge case = [prefix_array[len(nums)-2]]
        # middle cases = [prefix_array[i-1]* postfix_array[i+1]]

        prefix_array = []
        for i in range(len(nums)):
            if i == 0:
                prefix_array.append(nums[i])
            else:
                prefix_array.append(prefix_array[i-1] * nums[i])

        reversed_nums = nums[::-1]
        postfix_array = []
        for i in range(len(reversed_nums)):
            if i == 0:
                postfix_array.append(nums[i])
            else:
                postfix_array.append(prefix_array[i-1] * nums[i])
        postfix_array = postfix_array[::-1]

        ret_nums = []
        for i in range(len(nums)):
            if i == 0:
                n = postfix_array[i+1]
            elif i == len(nums):
                n = prefix_array[i-1]
            else:
                n = prefix_array[i-1] * postfix_array[i+1]
            ret_nums.append(n)

        return ret_nums

        
            


s = Solution()


nums = [1,2,3,4]

# [24,12,8,6]

v  = s.productExceptSelf(nums)

print(v)