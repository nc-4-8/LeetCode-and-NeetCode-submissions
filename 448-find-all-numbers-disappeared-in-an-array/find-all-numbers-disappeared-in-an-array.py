class Solution(object):
    def findDisappearedNumbers(self, nums):
        nums.sort()
        numbers = []    
        numSet = set(nums)
        for i in range(1, len(nums)+1):
            if i not in numSet:
                numbers.append(i)
        return numbers