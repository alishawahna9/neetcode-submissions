class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        min=prices[0]
        max=0

        for ind in prices[1:]:
            if ind<min:
                min=ind
            if ind-min > max:
                max=ind-min
        return max