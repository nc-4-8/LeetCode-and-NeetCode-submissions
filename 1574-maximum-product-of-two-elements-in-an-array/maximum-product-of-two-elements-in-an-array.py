class Solution(object):
    def maxProduct(self, nums):
        nums.sort()
        y = ((nums[-1]-1) * (nums[-2]-1))
        return y

        