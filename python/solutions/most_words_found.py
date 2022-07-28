class Solution:
    def mostWordsFound(self, sentences):
        # count the spaces
        num = float('-inf') #smallest number possible
        for str in sentences:
            count = 0
            for c in str:
                if c == ' ':
                    count += 1
            if(num < count):
                num = count
            
        return num +1
    
    
s = Solution()

input = [
    "alice and bob love leetcode",
    "i think so too",
    "this is great thanks very much"]

v = s.mostWordsFound(input)

print(v)
    


        