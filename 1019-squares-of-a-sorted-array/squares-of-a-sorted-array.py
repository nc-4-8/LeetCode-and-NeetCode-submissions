class Solution(object):
    def sortedSquares(self, nums):
        values = [num * num for num in nums]
        values.sort()
        return values