class Solution(object):
    def maxAlternatingSum(self, nums):

        square = [x * x for x in nums]
        square.sort()

        n = len(square)
        m = n //2

        return sum(square[m: ]) - sum(square[ :m])