
#https://www.simplilearn.com/tutorials/python-tutorial/list-to-string-in-python

class Solution:
    def groupAnagrams(self, strs):
        # Map hash -> List<String>       
        myDict = {}
        for ele in strs:
            #Determine the hash for the string
            hash = [0] * 27
            for c in ele:
                hash[ord(c)- ord('a')] += 1
                
            actual_hash = ' '.join(map(str,hash))
            if actual_hash not in myDict.keys():
                myDict[actual_hash] = []
            myDict[actual_hash].append(ele)
            
        return myDict.values()

    
strs = ["eat","tea","tan","ate","nat","bat"]

s = Solution()

print(s.groupAnagrams(strs))

        