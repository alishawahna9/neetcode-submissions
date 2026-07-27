class Solution:
    def countBits(self, n: int) -> List[int]:
        result=[]
        def count(num):

            res=0

            while num:
                res+=num&1
                num=num >> 1
            return res

        for num in range(n+1):

            result.append(count(num))
        return result
        

        