class Solution(object):
    def maxProduct(self, n):
        numList = []
        while(n!=0):
            numList.append(n%10)
            n = n//10
        numList.sort()
        n = len(numList)
        return numList[n-1] * numList[n-2]