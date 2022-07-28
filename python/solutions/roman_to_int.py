class Solution:
    def romanToInt(self, s):
        myDictionary = {}
        myDictionary['I'] = 1
        myDictionary['IV'] = 4
        myDictionary['V'] = 5
        myDictionary['IX'] = 9
        myDictionary['X'] = 10
        myDictionary['XL'] = 40
        myDictionary['L'] = 50
        myDictionary['XC'] = 90
        myDictionary['C'] = 100
        myDictionary['CD'] = 400
        myDictionary['D'] = 500
        myDictionary['CM'] = 900
        myDictionary['M'] = 1000
        
        sum = 0
        i = 0
        while i < len(s):
            if i == len(s)-1:
                # can't be a two letter word
                sum += myDictionary[s[i]]
                i = i + 1
            else:
                possibleTwoDigit = s[i]+ s[i+1]
                possibleOneDigit = s[i]
                if possibleTwoDigit in myDictionary.keys():
                    #we have a two digit
                    sum += myDictionary[possibleTwoDigit]
                    i = i + 2
                else:
                    sum += myDictionary[possibleOneDigit]
                    i = i +1
                
        return sum
    
    
s = Solution()

input1 = "LVIII"
input2 = "III"
input3 = "MCMXCIV"
input1 = "LVIII"

print(s.romanToInt(input3))
        