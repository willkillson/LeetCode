class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        lp = 0
        my_set = set()
        my_max = 0
        for rp in range(0, len(s)):
            while(s[rp] in my_set):
                my_set.remove(s[lp])
                lp += 1
            my_set.add(s[rp])
            my_max = max(my_max, rp-lp + 1)
        return my_max