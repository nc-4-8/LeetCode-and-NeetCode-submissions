class Solution(object):
    def sumCounts(self, nums):
        n = len(nums)
        ans = 0
        for i in range(n):
            passed = set()
            for j in range(i, n):
                passed.add(nums[j])
                ans += len(passed)**2
        
        return ans

        