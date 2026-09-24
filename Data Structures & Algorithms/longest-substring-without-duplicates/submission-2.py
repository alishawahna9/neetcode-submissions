class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        myset=set()
        max=0
        count=0
        l=0
        for r in s:
            while r in myset:
                myset.remove(s[l])
                l=l+1
                count=count-1
            myset.add(r)
            count=count+1
            if count > max :
                max=count
        
        return max
            
