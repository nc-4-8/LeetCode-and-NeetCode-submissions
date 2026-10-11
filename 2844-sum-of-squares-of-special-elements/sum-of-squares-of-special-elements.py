class Solution(object):
    def sumOfSquares(self, nums):
        n = len(nums)
        sum = 0
        for i in range (n):
            if(n % (i+1) == 0):
                sum += nums[i]*nums[i]

        return sum
        
            

        