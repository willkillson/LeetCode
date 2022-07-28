

class Solution:
    def finalValueAfterOperations(self, operations):
        myDictionary = {}
        myDictionary["++X"] = 1
        myDictionary["X++"] = 1
        myDictionary["--X"] = -1
        myDictionary["X--"] = -1
        
        myValue = 0
        
        for op in operations:
            myValue += myDictionary[op]
        return myValue
        

s = Solution()

input = ["--X","X++","X++"]

v = s.finalValueAfterOperations(input)

print(v)