class Solution(object):
    def findMissingElements(self, nums):
        nums.sort()
        newArr = []
        
        for i in range(len(nums)-1):
            if(nums[i+1]-nums[i]>1):
                for i in range(nums[i]+1, nums[i+1]):
                    newArr.append(i)
        return newArr
        