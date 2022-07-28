
class Solution:
    def isAnagram(self, s,t):
        
        if(len(s)!= len(t)):
            return False
        
        # Create an array of zeros
        hash = []
        for i in range(27):
            hash.append(0)
        
        for i in range(len(s)):
            hash[ord(s[i])-ord('a')] += 1
            hash[ord(t[i])-ord('a')] -= 1      
                 
        for i in range(27):
            if hash[i]!= 0:
                return False
        return True
    
solution = Solution()

var = solution.isAnagram("anagram", "nagaram")
print(var)
# print(ord('b') - ord('a'))