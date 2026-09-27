class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        numcounter={}

        for num in nums:

            if num in numcounter:
                numcounter[num]=numcounter.get(num,0)+1
            
            else:
                numcounter[num]=1
        
        sortedarray=[[] for _ in range(len(nums)+1)]

        for key in numcounter:

            sortedarray[numcounter[key]].append(key)

        
        result=[]
        count=0

        for bucket in sortedarray[::-1]:
            for num in bucket:
                result.append(num)
                if len(result) == k:
                    return result
        
        return result

        