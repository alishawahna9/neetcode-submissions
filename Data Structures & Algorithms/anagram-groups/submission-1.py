class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
             
        strings={}
        for word in strs:
            counter=[0]*26
            for char in word:
                counter[ord(char)-ord('a')]+=1;
            signature=tuple(counter)
            if signature in strings:
                strings[signature].append(word)
            else:
                strings[signature]=[word]
        result=[]
        for key in strings:
            list=[]
            for str in strings[key]:
                list.append(str)
            result.append(list)
        return result

        