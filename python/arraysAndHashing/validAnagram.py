class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False;

        hash = [0] * 27;
        for c in s:
            hash[ord(c)-ord('a')] += 1;
            hash[ord(c)-ord('a')] -= 1;
            
        for n in range(27):
            if(hash[n]!= 0):
                return False;
        return True;


s = Solution();

a1 = "rat"
a2 = "car"

print(s.isAnagram(a1,a2));   
