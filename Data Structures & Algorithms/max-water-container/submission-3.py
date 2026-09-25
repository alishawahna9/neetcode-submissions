class Solution:
    def maxArea(self, heights: List[int]) -> int:
        
        l=0
        length=len(heights)
        r=length-1
        max_size=min(heights[l],heights[r])*(r-l)
        temp_size=0
        while l<r:
            if heights[l]<heights[r]:
                l+=1
            elif heights[l]>heights[r]:
                r-=1
            else:
                if heights[l+1]>heights[r-1]:
                    l+=1
                else:
                    r-=1

            temp_size=min(heights[l],heights[r])*(r-l)
            if temp_size>max_size:
                max_size=temp_size
        
        return max_size
