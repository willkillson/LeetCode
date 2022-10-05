class Solution:
    def isPalindrome(self, s):
        
        s = s.lower() 
        b = 0
        e = len(s)-1

        while (b<e):
            if not ord(s[b]) >= ord('a') and ord(s[b])<=ord('z'):
                b += 1
                continue
            if not ord(s[e]) >= ord('a') and ord(s[e])<=ord('z'):
                e -= 1
                continue
            if s[b] != s[e]:
                return False
            b += 1
            e -= 1

        return True


s = "0P"

sol = Solution()
ans = sol.isPalindrome(s)

print(ans)