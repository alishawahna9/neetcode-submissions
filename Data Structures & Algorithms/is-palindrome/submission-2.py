class Solution:
    def isPalindrome(self, s: str) -> bool:
        l=0
        r=len(s)-1
        s=s.lower()
        while l<r:
            c=s[l]
            if not ((ord('a') <= ord(c) <= ord('z')) or (ord('0') <= ord(c) <= ord('9'))):
                l+=1
                continue
            c=s[r]
            if not ((ord('a') <= ord(c) <= ord('z')) or (ord('0') <= ord(c) <= ord('9'))):
                r-=1
                continue
            if s[l]!=s[r]:
                return False
            l+=1
            r-=1
        
        return True

        
        