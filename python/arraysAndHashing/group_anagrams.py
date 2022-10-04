class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        meep = {} # hash -> ["strings", "asdf"]
        s = []
        s = s.sort(key=lambda y: y[1],reverse = True)

        for s in strs:
            myHash = "".join(sorted(s))
            if myHash in meep:
                meep[myHash].append(s)
            else:
                meep[myHash] = []
                meep[myHash].append(s)
        return meep.values()
        

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        meep = {} # value -> count

        for n in nums:
            if n in meep.keys():
                meep[n] += 1
            else:
                meep[n] = 1

        

         # list of tuples
        tList = [(key, value) for key, value in meep.items()]
        sortedList = tList.sort(key=lambda y: y[1],reverse = True)

        retList = []
        for i in range(k):
            retList.append(sortedList[i])
        return retList
        
strs = ["eat","tea","tan","ate","nat","bat"]
solution = Solution()

ans = solution.groupAnagrams(strs)
print(ans)


