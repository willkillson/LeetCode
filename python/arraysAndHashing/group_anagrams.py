class Solution:
    def groupAnagrams(self, strs):
        # Map hash -> anagram-str
        myMap = {}
        
        for s in strs:
            sorted_str = sorted(s);
            sorted_str = "".join(sorted_str);
            if sorted_str not in myMap:
                myMap[sorted_str] = [s];
            else:
                myMap[sorted_str].append(s);
        return list(myMap.values());
        
strs = ["eat","tea","tan","ate","nat","bat"]
solution = Solution()

ans = solution.groupAnagrams(strs)
print(ans)
