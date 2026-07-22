class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        original_Dec={}

        for char in s:
            original_Dec[char] = original_Dec.get(char, 0) + 1

        for char in t:
            if original_Dec.get(char)==None:
                return False
            original_Dec[char]=original_Dec.get(char,0)-1
        
        for num in original_Dec.values():
            if num!=0:
                return False
        return True
