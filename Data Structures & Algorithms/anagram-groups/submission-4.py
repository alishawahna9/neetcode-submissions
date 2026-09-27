class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        wordsdic={}

        for i in strs:
            counter=[0]*26
            for j in i:
                counter[ord(j)-ord("a")]+=1

            strkey=tuple(counter)
            if strkey in wordsdic:
                wordsdic[strkey].append(i)
            else:
                wordsdic[strkey]=[i]

        result=[]
        for i in wordsdic:
            result.append(wordsdic[i])

        return result

