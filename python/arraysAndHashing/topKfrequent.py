class Solution:
    def topKFrequent(self, nums, k):
        # Map number -> frequency
        freq = {};
        for n in nums:
            if n in freq:
                freq[n] += 1;
            else:
                freq[n] = 1;

        # Convert a dictionary into a list of tuples
        list = [(k,v) for k, v in freq.items()];

        # Sort a list of tuples
        list.sort(key=lambda e:e[1],reverse=True);

        # Get the K items
        ret = []
        for i in range(0,k):
            ret.append(list[i][0])
        return ret;


nums = [-1,-1]
k = 1
solution = Solution()

ans = solution.topKFrequent(nums,k)
print(ans)
