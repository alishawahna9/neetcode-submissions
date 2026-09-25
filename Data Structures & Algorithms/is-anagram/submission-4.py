class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        firstdic={}
    
        for i in s:
            
            if i in firstdic:
                firstdic[i]=firstdic.get(i,0)+1
            else:
                firstdic[i]=1

        seconddic={}

        for i in t:
            
            if i in seconddic:
                seconddic[i]=seconddic.get(i,0)+1
            else:
                seconddic[i]=1

        return firstdic==seconddic

        
