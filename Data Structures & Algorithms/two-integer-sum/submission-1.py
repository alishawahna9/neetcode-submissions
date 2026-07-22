class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        my_set={}
        list=[]

        for num,value in enumerate(nums):
            temp=target-value
            if temp in my_set:
                list.append(my_set.get(temp))
                list.append(num)
                return list
            else:
                my_set[value]=num
        return list
                
        