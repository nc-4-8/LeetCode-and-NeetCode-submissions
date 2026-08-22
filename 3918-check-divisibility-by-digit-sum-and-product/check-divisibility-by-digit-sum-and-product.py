class Solution(object):
    def checkDivisibility(self, n):
        nList = [int(x) for x in str(n)]

        nSum = 0
        product = 1

        for digits in nList:
            nSum += digits
            product *= digits 

        return n %(nSum + product) == 0