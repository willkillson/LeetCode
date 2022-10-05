class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        s = s.lower()
        t = t.lower()

        hash = [0] * 27

        for i in range(len(s)):
            hash[ ord(s[i]) - ord('a') ] += 1
            hash[ ord(t[i]) - ord('a') ] -= 1

        for n in hash:
            if(n!=0):
                return False
        return True

class Solution2:
    def isAnagram(self, s: str, t: str) -> bool:
        s1 = "".join(sorted(s))
        s2 = "".join(sorted(t))
        if(s1 == s2):
            return True
        return False

s = Solution();

a1 = "rat"
a2 = "car"

print(s.isAnagram(a1,a2));   