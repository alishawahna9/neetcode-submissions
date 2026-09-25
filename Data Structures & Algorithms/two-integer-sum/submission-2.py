class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        seen={}

        for i,value in enumerate(nums):
            needed=target-value

            if needed in seen:
                return [seen.get(needed,0),i]
            else:
                seen[value]=i

        return []
                
        