class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        # Map value to frequency
        frequencyDictionary = {}
        for i in range(0,len(nums),1):
            value = nums[i]
            if value not in frequencyDictionary.keys():
                frequencyDictionary[value] = 1
            else:
                frequencyDictionary[value] = frequencyDictionary[value] + 1

        # Convert the map to a list and sort by frequency        
        listOfItemsBefore = list(frequencyDictionary.items())
        listOfItemsAfter = list(frequencyDictionary.items())
        
        def secondElement(element):
            return element[1]
        listOfItemsAfter.sort(key=secondElement,reverse=True)
        
        print(listOfItemsBefore)
        print(listOfItemsAfter)
        
        
        # get index from sorted list of frequencys
        ret = []
        for i in range(0,k,1):
            ret.append(listOfItemsAfter[i][0])
            
        

        return ret