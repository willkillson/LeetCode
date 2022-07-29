class Solution:
    def intToRoman(self, num):
        myDictionary = {}
        myDictionary[1] = 'I'
        myDictionary[4] = 'IV'
        myDictionary[5] = 'V'
        myDictionary[9] = 'IX'
        myDictionary[10] = 'X'
        myDictionary[40] = 'XL'
        myDictionary[50] = 'L'
        myDictionary[90] = 'XC'
        myDictionary[100] = 'C'
        myDictionary[400] = 'CD'
        myDictionary[500] = 'D'
        myDictionary[900] = 'CM'
        myDictionary[1000] = 'M'
        
        myList = list(myDictionary.keys())
        myList.sort(reverse=True)
        
        index = 0
        retString = ''
        while(index < len(myList) and num>0):
            # if the number is divisable by...
            if num / myList[index] >= 1:
                retString += myDictionary[myList[index]]
                num -= myList[index]
            else:
                index += 1
        
        return retString
        
num = 1994
s = Solution()
v = s.intToRoman(num)
print(v)